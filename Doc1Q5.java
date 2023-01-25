class Employee{
    public String firstname,lastname,designation;
    public int age;

    Employee(String fname, String lname, String desg, int a){
        this.firstname=fname;
        this.lastname=lname;
        this.designation=desg;
        this.age=a;
    }

    public void setFname(String f){
        this.firstname=f;
    }

    public void setLname(String l){
        this.lastname=l;
    }

    public void setDesg(String d){
        this.designation=d;
    }

    public void setAge(int a){
        this.age=a;
    }

    @Override
    public String toString(){
        return ("First Name is: "+this.firstname +", Last Name is "+ this.lastname + ", Age: "+ this.age);
    }
}
public class Doc1Q5 {
    public static void main(String[] args) {
        Employee e=new Employee("Ram","Sharma","Dev",20);
        String ans=e.toString();
        System.out.println(ans);
    }
}
