public class explanationstring{
    public static void main(String[] args) {
        // String str = "geeksforgeeks";
        // int count[] = new int[26];
        // for(int i=0; i<str.length(); i++)
        //     count[str.charAt(i)-'a']++;
        
        // for(int i=0; i<26; i++)
        //     if(count[i]>0)
        //         System.out.println((char)(i+'a')+ " " + count[i]);


        // String str = "tusharshourie";
        // System.out.println(str.length());
        // System.out.println(str.charAt(5));
        // System.out.println(str.substring(2));
        // System.out.println(str.substring(2, 5));    // start included ,end not included



        // String s1 ="geeks"; 
        // String s2="geeks";   //does not create new memory as contents are same when strings are created using literals
        // if(s1==s2)
        //     System.out.println("yes");   //they refer to the same object so yes
        // else
        //     System.out.println("no");

        // String s3 = new String("geeks");  //when we use new keyword, new memory is created
        // if(s1==s3)
        //     System.out.println("yesssss");
        // else    
        //     System.out.println("noooo");  // they dont refer to the same object so noooo



        // String s4="geeksforgeeks";
        // String s5="geeks";
        // System.out.println(s4.contains(s5));
  


        // String s6="tusharshourie";
        // String s7="tusharshourie";
        // System.out.println(s6.equals(s7));


        //inorder to check which one is  lexicographically greater and the strings are equal
        //checks which comes first(smaller) and which comes later(larger)
        
        // String str1 = "tusharshourie";
        // String str2 = "uwu";
        // int res= str1.compareTo(str2);
        // if(res==0)
        //     System.out.println("same");
        // else if(res>0)
        //     System.out.println("str1 greater");
        // else
        //     System.out.println("str2 greater");



        //Index of returns neg value if s2 is not present in s1
        // otherwise it returns the first occurence index of s2 in s1

        String a = "geeksforgeeks";
        String b="geeks";
        System.out.println(a.indexOf(b));
        System.out.println(a.indexOf(b,1));  //checks whether the b is present after given index in a

    }
}