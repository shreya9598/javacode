import java.util.*;

public class CQ1 {
    public static void main(String[] args) {
        ArrayList<Float> arr =new ArrayList<>();
        arr.add(5.7f);
        arr.add(2.3f);
        arr.add(4.1f);
        arr.add(6.25f);
        arr.add(7.9f);

        double sum=0;
        Iterator<Float> it = arr.iterator();
        while(it.hasNext())
        {
            sum+=it.next();
        }

        System.out.println("Sum of elements is " +sum);
    }
}
