public class countFreq {
    public static void main(String[] args) {
        int[] arr2 = {1,1,1,2,2,9,9,3,3};

        int n = arr2.length;

        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(visited[i]) continue;

            int count1 = 1;
            for(int j = i+1; j<n; j++){
                if(arr2[i] == arr2[j]){
                    count1 ++;
                    visited[j] = true;
                }
            }
            System.out.println(arr2[i] + " occured " + count1 + " number of times in the array.");
        }
        System.out.println();

    }
}
