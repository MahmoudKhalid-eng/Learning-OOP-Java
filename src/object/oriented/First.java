
package object.oriented;


public class First { 
// default be accessed in same class and classes in same packacge
    int x;
    void p(){
        System.out.println("Hello Default");             
    }
// public can be accessed any where  
    int x1;
    void p1(){
        System.out.println("Hello Public");             
    }
// private can be accessed only in same class  
    int x2;
    void p2(){
        System.out.println("Hello private");             
    } 
// protected can be accessed any where unless different package  
    int x3;
    void p3(){
        System.out.println("Hello protected");             
    }    
}
