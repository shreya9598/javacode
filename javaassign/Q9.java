class Singleton{
    private static Singleton instance=null;
    public String s;
    private Singleton(){
        s="Hello";
    }

    public static Singleton getInstance(){
        if(instance == null)
            instance =new Singleton();
        return instance;
    }
} 
public class Q9 {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        System.out.println(x.hashCode());
    }
    
}
