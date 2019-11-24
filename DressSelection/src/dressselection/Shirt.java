
package dressselection;

class Shirt extends Dress {
 String size;
 @Override
 public void showDetails() {
 System.out.println("This is a shirt and size is " + this.size);
 super.showDetails();
 }
 @Override
 public String getDetails(){
     return "This is a shirt and size is " + this.size;
 }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
         
}
