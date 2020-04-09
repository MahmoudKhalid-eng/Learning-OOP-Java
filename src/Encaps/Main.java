package Encaps;

public class Main {
    public static void main(String[] args){
        H hh = new H(15,16,"M");
        System.out.println(hh.getX());
        System.out.println(hh.getY());
        System.out.println(hh.getS());
        hh.setX(1);
        hh.setY(2);
        hh.setS("A");
        System.out.println(hh.getX());
        System.out.println(hh.getY());
        System.out.println(hh.getS());
        
    }
}
