
package Interface;


public class Mp4 implements Media{
    
    
    @Override
    public void show() {
        System.out.println("Hello interface mp4");
    }
    
    @Override
    public int power(int s) {
        return s*4;
    }
}
