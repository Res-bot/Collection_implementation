import java.util.Arrays;

public class arrangealphabet {
    public static void main(String[] args) {
        String st1 = "ccaabbd";

        char[] ch = st1.toCharArray();

        Arrays.sort(ch);

        String st2 = new String(ch);

        System.out.println(st2);
        

        
    }
}
