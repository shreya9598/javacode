public class Q8 {
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }
    public static void main(String[] args) {
        int arr[] ={5,6,2,9,3};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] +" ");
    }
}
