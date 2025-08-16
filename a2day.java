import java.util.ArrayList;
import java.util.Collections;

public class a2day {
        //program to search an element in an arrayList
        public static int searchBuiltIn(ArrayList<Integer> lis1, int element){
            return lis1.indexOf(element);
        }

        public static int seachLoop(ArrayList<Integer> lis2, int element2 ){
            for(int i=0; i<lis2.size(); i++){
                if(lis2.get(i) == element2){
                    return i;
                }
            }
            return -1;
        }


        public static void main(String[] args) {
        //program to sort an array in ascending and descending order

        ArrayList<Integer> arLis = new ArrayList<>();
        arLis.add(36);
        arLis.add(98);
        arLis.add(74);
        arLis.add(81);
        arLis.add(53);
        
        System.out.println("Original List" + arLis);

        Collections.sort(arLis);
        System.out.println("Sorted in ascendig order: " + arLis);

        Collections.sort(arLis, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " +arLis);

        System.out.println(searchBuiltIn(arLis, 81));;
        System.out.println(seachLoop(arLis, 53));;

    }
}
