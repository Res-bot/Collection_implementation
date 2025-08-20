public class commonElement {
    public static void main(String[] args) {
        int[] a = {3,5,6,2,8};
        int[] b = {9,2,5,7,6,3,2};

        for(int i=0; i<=a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}
