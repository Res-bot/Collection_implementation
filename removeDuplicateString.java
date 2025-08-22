import java.util.Scanner;

public class removeDuplicateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        char[] ch = s.toCharArray();
        int len = ch.length;
        boolean[] vis = new boolean[len];
        for(int i=0; i<len; i++){
            if (vis[i]) continue;
            for(int j=i+1; j<len; j++){
                if (ch[i] == ch[j]) {
                    vis[j] = true; 
                }
            }
            System.out.print(ch[i]);
        }
    }
}
