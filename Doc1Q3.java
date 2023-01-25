import java.util.*;
public class Doc1Q3 {
    public static double area(float r)
    {
        return 3.14*r*r;
    }

    public static double circumference(float r)
    {
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        System.out.println("*********Menu*********");
        System.out.println();
        System.out.println("1. Calculate Area of Circle ");
        System.out.println("2. Calculate Circumference of Circle ");
        System.out.println("3. Exit ");
        System.out.println();
        System.out.println("Choose an option");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter radius");
        float r=sc.nextFloat();
        
        switch(a){
            case 1:
                double y= area(r);
                System.out.println("Area is "+y);
                break;
            case 2:
                double z=circumference(r);
                System.out.println("Circumference is "+z);
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Press a valid option...");
        }
    }
}
