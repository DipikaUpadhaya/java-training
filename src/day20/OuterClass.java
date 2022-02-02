package day20;

public class OuterClass {
    int outVaraible= 30;

    public class InnerClass{
        int outVaraible= 50;// same variable can made on both inner and outerclass

        public void display(){
            System.out.println("The output is:  "+ OuterClass.this.outVaraible); // to access vriable of outerclass this operator used
        }
    }



    public static void main(String[] args) {
       // OuterClass outerClass= new OuterClass(); //can easily make object of outerclass
        InnerClass innerclass= new OuterClass().new InnerClass();// object of inner class is made by helpof outerclass
       // InnerClass innerClass= outerClass.new InnerClass();
        innerclass.display();
    }
}
