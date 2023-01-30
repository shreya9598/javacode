import java.util.HashMap;

public class Q6 {
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,4,2,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(HashMap.Entry<Integer,Integer>entry: map.entrySet()){
           if(entry.getValue()==1){
                System.out.println("Number is " + entry.getKey());
           }
       }
    }    
}
