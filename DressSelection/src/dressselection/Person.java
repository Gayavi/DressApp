package dressselection;

import javax.swing.JOptionPane;

class Person {

    double budget;
    Dress[] items;
    int noOfItems;
    int maxItems;

    public Person(double budget, int maxItems) {
        this.budget = budget;
        items = new Dress[maxItems];
        this.maxItems = maxItems;
    }

    public boolean addItem(Dress d) {
        if (noOfItems < maxItems) {
            this.items[this.noOfItems] = d;
            noOfItems++;
            return true;
        } else{
           return false;
        }

    }


    public String getMessage() {
        String msg = "----Details of the persons as follows----\n";
        msg = msg + "budget of this person is " + this.budget + "\n";
        msg = msg + "number of dresses " + this.noOfItems + "\n";
        double totalPrice = 0;
        for (int i = 0; i < noOfItems; i++) {
            msg = msg + "Item No" + (i + 1) + "\n";
            msg = msg + this.items[i].getDetails() + "\n";
            msg = msg + "price of the dress is:" + this.items[i].getPrice() + "\n\n";
            totalPrice = totalPrice + this.items[i].getPrice();
        }
        if (totalPrice > this.budget) {
            msg = msg + "This is over budgeted person";
        } else if (totalPrice < this.budget) {
            msg = msg + "This is low budgeted person";
        } else {
            msg = msg + "This is balanced budget person";
        }
        return msg;

    }

}
 