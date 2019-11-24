
package dressselection;

class Dress {
 private double price;
 
 public void setPrice(double price) {
 this.price = price;
 }
 public double getPrice() {
 return price;
 }
 public void showDetails() {
 System.out.println("Price of this dress is " + this.price);
 }
 public String getDetails(){
     return "Price of this dress is " + this.price;
 }
}
