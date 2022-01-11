package day8;

public class ShoppingMall {
    public static void main(String[] args) {
      //  Door doorIN= new Door();// after making field static it isnot necessaryy to make objects
        //doorIN.count+=1;

        Door.count+=1;


       // Door doorOut= new Door();
       // doorOut.count-=1;
        Door.count-=1;

        //System.out.println("Inside mall: "+ doorIN.count);
        System.out.println(+Door.count);
    }
}
