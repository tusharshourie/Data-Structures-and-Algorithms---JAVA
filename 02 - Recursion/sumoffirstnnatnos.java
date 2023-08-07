public class sumoffirstnnatnos {
    static int getsum(int n){
        if(n==0)
        return 0;
        return n+getsum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int sum = getsum(n);
        System.out.println(sum);
    }
    
}
//time complexity = Theta(n)
//auxiliary space= theta(n)
