public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,6};
        int len = arr.length;
        boolean swap;

        for (int i = 0; i < len - 1; i++) {
            swap = false;
            for (int j = 0; j < len - 1; j++) {
                if (arr[j] > arr[j + 1]) {
            
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
        }

        //print sorted array

        for(int k=0; k<len ; k++){
            System.out.print(arr[k]);
        }


    }

}

