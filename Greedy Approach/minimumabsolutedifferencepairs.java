// Given two arrays A and B of equal length n. Pair each element of array A to an
// element in array B, such that sum S of absolute differences of all pairs is min

//A=[1,2,3]    B=[2,1,3]
//ans = 0

// pair the element in A with the element which is nearest to it in B

// if a case arises when two nos are nearest to the no in A then sort both the arrays
// and try to pair up the smallest with the smallest and largest with largest


//eg: A=[4,1,8,7]   sort =>     A=[1,4,8,7]
// B=[2,3,6,5]   sort=>   B=[2,3,5,6]
// then pairs = |1-2| = 1
//              |4-3| = 1
//              |7-5| = 2
//              |8-6| = 2
// so 1+1+2+2=6 MINIMUM

import java.util.*;
public class minimumabsolutedifferencepairs {
    public static void main(String[] args) {
        int A[]= {4,1,8,7};
        int B[]= {2,3,5,6};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff=0;

        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i]-B[i]);
        }

        System.out.println("Minimum Absolute Diff of pairs = " + minDiff);
    }
}

//O(nlogn)