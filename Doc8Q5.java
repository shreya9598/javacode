interface Dancer { 
    default void write() { 
        System.out.println("I am dancer"); 
    } 
}

interface Singer { 
    default void write() { 
        System.out.println("I am singer"); 
    } 
}

public class Doc8Q5 implements Dancer, Singer{
    @Override 
    public void write(){ 
        System.out.println("Dancing is my passion"); 
    }

    public static void main(String[] args) {
        Doc8Q5 s=new Doc8Q5();
        s.write();
    }
}

