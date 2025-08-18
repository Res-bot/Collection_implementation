import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student<T>{
        private int id;
        private String name;
        private T  course;

        public Student(int id, String name, T course){
            this.id = id;
            this.name = name;
            this.course = course;
        }

        public int getId(){
            return id;
        }

        public String getName(){
            return name;
        }

        public T getCourse(){
            return course;
        }


        @Override
        public String toString(){
            return "Student[ id: " + id + ", name: " + name + " , course: " + course + " ]";
        }
}

public class a3day{
    public static void main(String[] args) {
        
        //arraylist with generics
        List<Student<String>> stlist = new ArrayList<>();
        stlist.add(new Student<>(1, "Rebecca", "MBA"));
        stlist.add(new Student<>(2, "Caroline", "BBA"));
        stlist.add(new Student<>(3, "Carol", "BCA"));


        System.out.println("Student list: ");
        for(Student<String> s: stlist){
            System.out.println(s);
        }


        //using hashmap with generics 
        Map<Integer, Student<String>> stmap = new HashMap<>();
        for(Student<String> s: stlist){
            stmap.put(s.getId(), s);
        }
        System.out.print("Fetching student by id(2): ");
        System.out.print(stmap.get(2));
        

    }
}





