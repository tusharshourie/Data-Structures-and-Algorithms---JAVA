//two arrays, first array represents the amount of petrol at a pump
// the second array represents the distance b/w two pumps (first-> second...... last->first coz circular tour)


public class FirstCircularTour {
    int firstPetrolPump(int petrol[], int dist[], int n){
        int start=0;
        int curr_pet=0;
        int prev_pet=0;
        for(int i=0; i<n; i++){
            curr_pet+=(petrol[i]-dist[i]);
            if(curr_pet<0){
                start=i+1;
                prev_pet=curr_pet;
                curr_pet=0;
            }
        }
        return ((curr_pet+prev_pet >=0)?(start+1):-1);
    }
    public static void main(String[] args) {
        FirstCircularTour f = new FirstCircularTour();
        int petrol[] = {50,10,60,100};
        int dist[]={30,20,100,10};
        int n=petrol.length;
        int x = f.firstPetrolPump(petrol, dist, n);
        System.out.println(x);
    }
}


//time=O(n)
//space =O(1)