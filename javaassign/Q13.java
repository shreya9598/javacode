import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        System.out.println("Enter word");

        Scanner sc=new Scanner(System.in);
        String temp= sc.next();
        
        // while(!temp .equals("done")){
            
        //     if(temp.charAt(0) == temp.charAt(temp.length()-1)){
        //         System.out.println("Equal");
        //     }
        //     else
        //     System.out.println("Not Equal");
            
        //     temp=sc.next();
        // }

        do{
            if(temp.charAt(0) == temp.charAt(temp.length()-1)){
                System.out.println("Equal");
            }
            else
            System.out.println("Not Equal");

            temp=sc.next();
        }
        while(!temp .equals("done"));
    }
}
