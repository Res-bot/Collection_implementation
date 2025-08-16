import java.util.ArrayList;
import java.util.Collections;

public class a2day {
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
    }
}
