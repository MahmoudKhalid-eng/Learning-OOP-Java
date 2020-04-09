package AccessModifier;

public class Main {
    //                                     same_class  Same_package    sub_class   Different_package
        public int pub=1;     //public        yes          yes            yes             yes
        protected int prot=2; //protected     yes          yes            yes             no
        int def=3;            //default       yes          yes  Same_pckg=yes/dif=no      no
        private int pt=4;     //private       yes          no             no              no
}
