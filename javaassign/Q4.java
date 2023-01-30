
public class Q4 {
    public static void main(String[] args) {
        String s="My Name is $Shreya Gupta %% & 546";
        int upper=0,lower=0,special=0,num=0;
        int total=s.length();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
                upper++;
            else if (Character.isLowerCase(ch)) {  
                lower++;  
            }  
            else if (Character.isDigit(ch)) {  
                num++;  
            }  
            else
                special++;
        }
        System.out.println("Percentage of UpperCase letters is : " + (upper*100) /total+"%");
        System.out.println("Percentage of LowerCase letters is : " + (lower*100) /total+"%");
        System.out.println("Percentage of Digits  is : " + (num*100) /total+"%");
        System.out.println("Percentage of Special Characters is : " + (special*100) /total+"%");

    }
}
