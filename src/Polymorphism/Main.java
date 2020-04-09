
package Polymorphism;


public class Main {
    public static void printPrice(Car cc){
        cc.showPrice();
    }
    public static void main(String[] args) {
        Car c1= new Car();
        A a1=new A();
        B b1=new B();
        C cc2=new C();
        c1.printPrice(c1);
    }
}
