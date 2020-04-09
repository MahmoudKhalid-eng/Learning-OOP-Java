
package object.oriented;


public class ObjectOriented {

    public static void main(String[] args) {
        First f1 = new First();
        f1.p();
        f1.p1();
        System.out.println("Can't access private");
        f1.p3();
    }
    
}
