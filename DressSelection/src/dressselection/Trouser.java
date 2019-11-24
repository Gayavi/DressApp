
package dressselection;

class Trouser extends Dress {
 String length;

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
 
 @Override
 public void showDetails() {
 System.out.println("This is a trouser and length is " + this.length);
 super.showDetails();
 }
 @Override
 public String getDetails(){
     return "This is a trouser and length is " + this.length;
 }
}
