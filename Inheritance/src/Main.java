class A1 {
    A1(int a){
        System.out.println("class A1 constructor");
    }
    int a[] = {1, 2, 4};


    void A1M(){

    }
    void A1M(int a){

    }
   final void  print(){
        System.out.println("print method of A1");
    }
}
class B1 extends A1{
    final int PI=11;

    B1(){
        super();

        System.out.println("Class b1 constructor"+this.PI);

    }
    void print(){
        int a =10;
        for (int loop : super.a) {
            System.out.println(loop);
        }
        //this.print();
        System.out.println("print method of B1 = "+a);
        //this.print();
    }
}

//class C1 extends  A1{
  //  C1(){
     //   super(0);
   // }
//}
public class Main {
    public static void main(String[] args) {
       new B1().print();
    }
}