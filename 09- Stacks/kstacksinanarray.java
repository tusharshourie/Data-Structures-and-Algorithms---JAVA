class kStacks{
    int arr[];
    int freetop;
    int cap;
    int k;
    int top[];
    int next[];
    kStacks(int k1, int n){
        k=k1;
        cap=n;
        arr=new int[cap];
        top=new int[k];
        next=new int[cap];

        for(int i=0; i<k; i++)
            top[i]=-1;

        freetop=0;
        for(int i=0; i<cap-1;i++)
            next[i]=i+1;
        next[cap-1]=-1;
    }


    void push(int x, int sn){
        int i=freetop;
        freetop=next[i];
        next[i]=top[sn];
        top[sn]=i;
        arr[i]=x; 

    }

    int pop(int sn){
         int i=top[sn];
         top[sn]=next[i];
         next[i]=freetop;
         freetop=i;
         return arr[i];
    }
}

public class kstacksinanarray {
    
}
