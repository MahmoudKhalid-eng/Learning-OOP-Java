package MethodOverliading;

public class Main {
    // the difference should be after the method's name
    // the difference can be in parameters data type or number of them
    
    public static int sum(int x){
        return x;
    }
    public static int sum(int x,int y){
        return x+y;
    }
    public static int sum(int x,int y,int z){
        return x+y+z;
    }
    public static String sum(String message,int x,int y){
        message += x+y;
        return message;
    }
    public static void main(String[] args){
        System.out.println(sum(1));
        System.out.println(sum(1,2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum("The sum is : ", 1, 4));
    }
}
