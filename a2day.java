import java.util.ArrayList;
import java.util.Collections;


public class a2day {
        //program to merge two arrayLists

        public static void mrgLis(ArrayList<Integer> arli1, ArrayList<Integer> arli2){
            ArrayList<Integer> dumArr = new ArrayList<>(arli1);
            dumArr.addAll(arli2);
            System.out.print(dumArr);
        }

        //program to search an element in an arrayList
        public static int srchBuiltIn(ArrayList<Integer> lis1, int element){
            return lis1.indexOf(element);
        }

        public static int srchLoop(ArrayList<Integer> lis2, int element2 ){
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

        for(int i= arLis.size()-1; i >= 0; i--){
            System.out.println(arLis.get(i));
        }
        
        System.out.println("Original List" + arLis);

        Collections.sort(arLis);
        System.out.println("Sorted in ascendig order: " + arLis);

        Collections.sort(arLis, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " +arLis);

        System.out.println(srchBuiltIn(arLis, 81));
        System.out.println(srchLoop(arLis, 53));

        ArrayList<Integer> arrlis1 = new ArrayList<>();
        arrlis1.add(22);
        arrlis1.add(24);
        arrlis1.add(26);
        arrlis1.add(28);

        ArrayList<Integer> arrlis2 = new ArrayList<>();
        arrlis2.add(32);
        arrlis2.add(34);
        arrlis2.add(36);
        arrlis2.add(38);

        mrgLis(arrlis1, arrlis2);

        
    }
}
