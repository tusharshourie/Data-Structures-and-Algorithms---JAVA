public class nto1rec {
    static void fun(int n){
        if(n==0)
        return;
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(5);    //time complexity= theta(n)
    } 
}
