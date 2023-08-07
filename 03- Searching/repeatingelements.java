/* ARRAY IN WHICH ALL THE ELEMENTS ARE PRESENT ONLY ONCE
 * BUT ONLY ONE ELEMENT REPEATS (ANY NO. OF TIMES)
 * 
 * ARRAY SIZE, N>=2
 * ALL THE ELEMENTS FROM 1 TO max(arr) ARE PRESENT
 * THEREFORE, 1<= max(arr)<=n-1
 * NOTE: no changes should be made to the array
*/
public class repeatingelements {
    static int findRepeating(int arr[], int n){
        int slow= arr[0], fast = arr[0];
        do{
            slow = arr[slow];       //slow moves one by one
            fast = arr[arr[fast]];  //fast moves to the index = value of element present at the current location
        } while(slow!=fast);        // both meet at 7

        slow=arr[0];                //fast is fixed to 7 while slow is set to index 0 value
        while(slow!=fast){
            slow=arr[slow];         //here both are moved at equal speed
            fast=arr[fast];         //both meet at 3 which is repeating
        }
        return slow;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,6,5,7,3};
        int n = arr.length;
        System.out.println(findRepeating(arr, n));
    }
}
//time = O(n)
//aux space = O(1)

//IF THE SMALLEST ELEMENT IN THE ARRAY IS 0 THEN INCREASE SLOW AND FAST BY 1 IN ABOVE CODE
// AND RETURN SLOW-1