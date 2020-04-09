
package Static;


public class Main {
    public static void main(String[] args) {
        A st=new A();
        A st1=new A();
        A st2=new A();
        A st3=new A();
        st.name="Mahmoud";
        st1.name="Khalid";
        st2.name="Samir";
        st3.name="Ahmed";
        A.age=20;  // (st,st1,st2,st3).age=20
        System.out.println(st.age+" "+st.name);
        System.out.println(st1.age+" "+st1.name);
        System.out.println(st2.age+" "+st2.name);
        System.out.println(st3.age+" "+st3.name);
        A.print("7oka"); // Hello 7oka
        
    }
}
