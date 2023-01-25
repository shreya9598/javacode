import java.util.*;
public class Employee1 {
    public String name,designation;
    public int age,salary;

    Employee1(String n, String desg, int a,int s){
        this.name=n;   
        this.designation=desg;
        this.age=a;
        this.salary=s;
    }
    public static void main(String[] args) {
        Employee1 e=new Employee1("abc","developer",30,1000);
        HashMap<Employee1, Integer> mp= new HashMap<>();
        mp.put(e, e.salary);
        System.out.println(mp);
    }
}
