import java.util.ArrayList;

class MyStack{
    ArrayList<Integer> al= new ArrayList<>();

    void push(int x){
        al.add(x);
    }

    int pop(){
        int res=al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }

    int peek(){
       return al.get(al.size()-1); 
    }

    int size(){
        return al.size();
    }

    boolean isEmpty(){
        return al.isEmpty();
    }
}

public class arrayimplementationstack{
    public static void main(String[] args) {
        MyStack s= new MyStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        s.push(40);
    }
}