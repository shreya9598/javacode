class Operations{
    public int sum(int x,int y){
        return x+y;
    }

    public int sub(int x,int y){
        return x-y;
    }

}
public class Doc8Q2 {
    public static int multi(int x,int y){
        return x*y;
    }
    public static void main(String[] args) {
        Operations o=new Operations();
        System.out.println("Sum is: "+o.sum(78,92));
        System.out.println("Difference is: "+o.sub(78,92));
        int ans= multi(6,5);
        System.out.println("Multiplication is: "+ans);
    }
}
