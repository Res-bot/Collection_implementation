import java.util.ArrayList;


public class mergeArray {

    //program to merge two arrays and then sort by even and odd
    public static void mrgArr(ArrayList<Integer> arlis5, ArrayList<Integer> arlis6){
        ArrayList<Integer> arlis7 = new ArrayList<>(arlis5);
        arlis7.addAll(arlis6);
        System.out.println(arlis7);

    }
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(4);
        arr1.add(6);
        arr1.add(2);
        arr1.add(8);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(9);
        arr2.add(3);
        arr2.add(5);
        arr2.add(7);

        mrgArr(arr1, arr2);

        
        
    }
}
