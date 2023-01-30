
public class Q11 {
    public static void main(String[] args) {
        int a[] =new int[10];
        try{
            System.out.println(a[12]); 
        }
        catch(ArrayIndexOutOfBoundsException e){  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }
        catch(ArithmeticException e){    
            System.out.println("Arithmetic Exception occurs");  
        }    
            

        finally{
            System.out.println("Something is printed");
        }
    }
}
