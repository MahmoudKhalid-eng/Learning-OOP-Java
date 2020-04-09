package Inheritance;

public class Main {
    public static void main(String[] args) {
        A a1=new A(); // Super and don't inherit so have only it's attributes
        a1.a=1;
        a1.b=1;
        a1.c=1;
        B b1=new B(); // Sub of A and Super for C so gives his attributes to C and take from A
        b1.a=2;
        b1.b=2;
        b1.c=2;
        b1.d=2;
        b1.e=2;
        b1.f=2;
        C c1=new C();//  Sub of B so take attributes from B 
        c1.a=3;
        c1.b=3;
        c1.c=3;
        c1.d=3;
        c1.e=3;
        c1.f=3;
        c1.g=3;
        c1.h=3;
        c1.i=3;
        
    }
}
