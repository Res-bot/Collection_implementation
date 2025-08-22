public class ilovestring {
    public static void main(String[] args) {
        String s = "I love python";

        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);


            
        }


        String st = s.replace("python", "java");

        System.out.print(st);
    }
}
