public class fibonacci {
    static int n1=0, n2=1, n3=0;
    static void fib(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fib(count-1);
        } 
    }

    public static void main(String[] args) {
        int count=10;
        System.out.print(n1+ " " +n2);
        fib(count-2);
    }
    
}
