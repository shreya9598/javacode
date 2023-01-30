import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        String s="My name is Shreya. My name gghjj";
        HashMap<String,Integer> mp=new HashMap<>();
        String words[] = s.split(" ");
        for(int i=0;i<words.length;i++)
        {
            if(mp.containsKey(words[i]))
                System.out.println(words[i]);
            mp.put(words[i],1);            
        }

    }
}
