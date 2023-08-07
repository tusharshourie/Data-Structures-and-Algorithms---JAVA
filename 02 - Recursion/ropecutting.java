public class ropecutting {
    
    static int maxpieces(int n, int a, int b, int c){
        if(n==0) {return 0;}
        else if(n < 0) {return -1;}
        int temp1=maxpieces(n-a,a,b,c);
        int temp2=maxpieces(n-b,a,b,c);
        int temp3=maxpieces(n-c, a, b, c);
        int res =  Math.max(temp3, Math.max(temp1, temp2));
        if(res==-1){
            return -1;
        }
        return res + 1;
        }
    public static void main(String[] args) {
        System.out.println(maxpieces(15, 5, 8, 7));
    }
}
