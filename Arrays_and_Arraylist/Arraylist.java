package Arrays_and_Arraylist;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //arraylist are used to store variable number of data in them 
        // we dont have to specify the size of the arraylist.

        // inside the arraylist "<>" we have to pass wrapper classes instead of the primitives.
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);

        //update
        arr.set(0,6 );                  //arr.set(index,value)
        System.out.println(arr.contains(6));        //check if the list contains any value
        arr.remove(0);                          //remove value on any index
        System.out.println(arr.get(0));         //gives the refrence of any index in the arraylist

        //multi dimensional arraylist
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();   //this just shows that the arraylist "list can conatain more arraylists"

        for (int i=0;i<3;i++) {                 //initialisation
            list.add(new ArrayList<>());        //3 arraylists have been added to "list"
        }

        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        System.out.println(list);
        sc.close();
    }
}
