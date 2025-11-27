public class MoveAllZerostoEnd {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,2,3};

        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            } else {
                arr[j] = arr[i];
            }
            j++;
        }

        while(j < arr.length){
            arr[j] = 0;
            j++;
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
