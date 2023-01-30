import java.util.HashSet;

public class Q5 {
    public static void main(String[] args) {
        int[] arr1 = { 1,2,3,5,6,7,20};
        int[] arr2 = { 1,9,3,5,11,7,20};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int i : arr1) {
            set1.add(i);
        }

        for (int i : arr2) {
            set2.add(i);
        }

        set1.retainAll(set2);

        System.out.print(set1 +" ");
    }
}
