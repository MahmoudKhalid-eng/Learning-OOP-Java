
package Interface;


public class Mp3 implements Media {
    int a,b;
    public Mp3(){
        this.a=1;
        this.b=2;
    }
    public void print(){
        System.out.println("Hello");
    }
    @Override
    public void show() {
        System.out.println("Hello interface mp3");
    }
    
    @Override
    public int power(int s) {
        return s*3;
    }
    
}
