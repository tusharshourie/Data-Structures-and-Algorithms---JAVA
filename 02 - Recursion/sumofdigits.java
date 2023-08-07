public class sumofdigits {
    
    static int sumofdig(int n){
        if(n==0)
        return 0;
        else
        return sumofdig(n/10)+n%10;
    }
    public static void main(String[] args) {
        int n = 253;
        int sum = sumofdig(n);
        System.out.println(sum);
    }
    
}
//time comp=theta(d)
//aux space=theta(d)