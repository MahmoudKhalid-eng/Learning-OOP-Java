package Shape_Example_PracticeOnInheritance;


public class Shape {
    int length,width,area;
    public Shape(){
        
    }
    public Shape(int x,int y){
        this.length=x;
        this.width=y;
        this.area=width*length;
    }
    public void showArea(){
        System.out.println("The Area = "+area);
    }
}
