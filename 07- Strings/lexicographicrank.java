public class lexicographicrank {
  static final int CHAR=256;
  
  static int fact(int n){
    if(n==0){
        return 1;
    }
    return n*fact(n-1);
  }
  static int lexRAnk(String str){
    int res=1;
    int n=str.length();
    int mul=fact(n);
    int []count = new int[CHAR];
    for(int i=0; i<n; i++)
        count[str.charAt(i)]++;
    for(int i=1; i<CHAR; i++){
        count[i]+=count[i-1];
    }
    for(int i=0;i<n;i++){
        mul=mul/(n-i);
        res=res+count[str.charAt(i)-1]*mul;
        for(int j=str.charAt(i); j<CHAR; j++)
            count[j]--;
    }
    return res;
  }
  
  public static void main(String[] args) {
    String str="STRING";
    System.out.println(lexRAnk(str));
  }
}
