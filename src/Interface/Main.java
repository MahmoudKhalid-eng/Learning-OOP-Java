
package Interface;


public class Main {
    public static void main(String[] args) {
        Mp3 m3= new Mp3();
        m3.show();
        System.out.println(m3.power(5));
        m3.print();
        System.out.println(m3.a+" "+m3.b);
        
        Mp4 m4= new Mp4();
        m4.show();
        System.out.println(m4.power(5));
        
        Mp3_sub mp3s=new Mp3_sub();
        mp3s.a=6;
        mp3s.b=7;
        mp3s.show();
        mp3s.print();
        mp3s.power(5); 
    }
}
