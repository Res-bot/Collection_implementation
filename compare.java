import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compare {
    public static void main(String[] args){
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10 > j%10){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        List<Integer> arli = new ArrayList<>();
        arli.add(23);
        arli.add(91);
        arli.add(10);
        arli.add(11);
        arli.add(35);

        System.out.println("the unsorted arraylist(on the basis of the unit digit) is: " + arli);

        Collections.sort(arli, comp);

        System.out.println("the sorted arraylist(on the basis of the unit digit) is: " + arli);


        //program to create an array of strings and sort the string array on the basis of the length of the string

        Comparator<String> comStr = new Comparator<String>() {
            public int compare(String i, String j){
                if(i.length()> j.length()){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<String> strAr = new ArrayList<String>();

        strAr.add("r");
        strAr.add("ram");
        strAr.add("ramana");
        strAr.add("rama");
        strAr.add("raman");

        System.out.println("Unsorted array on the basis of string length: " + strAr);

        Collections.sort(strAr, comStr);

        System.out.println("Sorted array on the basis of string length: " + strAr);




    }
}
