@FunctionalInterface
 interface Grt {
    boolean greater(int x,int y); 
}

@FunctionalInterface
interface Incr{
    int increment(int x);
}

@FunctionalInterface
interface Ccat{
    String concat(String s1, String s2);
}

@FunctionalInterface
interface Up{
    String upper(String s);
}

public class Doc8Q1 {
    public static void main(String[] args) {
        int a = 5,b=9;
        
        Incr s = (int x) -> x +1;
        int ans = s.increment(a);
        System.out.println(ans);

        Grt g= (int x,int y) ->{
            if(x>y)
                return true;
            else
                return false;
        };       
        boolean maxi=g.greater(a, b);
        System.out.println(maxi);

        String m="abc";
        String n="def";
        Ccat c= (String s1, String s2)->{
            return s1+s2;
        };
        String res=c.concat(m,n);
        System.out.println(res);

        Up u=(String str)->{
            return str.toUpperCase();
        };
        String z=u.upper(res);
        System.out.println(z);
    }
}
