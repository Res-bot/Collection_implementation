import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class a1day {

        //function to replace an element at a specific index with new value
    public static void replaceEle(ArrayList<Integer>li, int index, int newVal){
        if(index>=0 && index<=li.size()){
            li.remove(index);
            li.add(index,newVal);
            System.out.print("Updated arrayList: " + li);
        }else{
            System.out.println("Invalid index.");
        }
    }

    
    public static void main(String[] args) {
        //program to iterate an arrayList
        ArrayList<Integer> ele = new ArrayList<>();
        ele.add(1);
        ele.add(2);
        ele.add(3);
        ele.add(4);
        ele.add(5);
        
        Iterator<Integer> it = ele.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Original ArrayList: " + numbers);


        //replacing element from an index
        System.out.println("Enter the index to replace: ");
        int inde = sc.nextInt();
        System.out.println("Enter the element to replace: ");
        int elem = sc.nextInt();
        replaceEle(numbers, inde, elem);
        sc.close();
    }
}
