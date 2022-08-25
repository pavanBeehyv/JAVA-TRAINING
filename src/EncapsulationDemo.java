//Encapsulation -> binding data with methods ,we should always access data through methods
class Student{
    private int rollno;   //object knows something refers to fields
    private String name;

    public int getRollno(){//object does something refer to methods
        System.out.println("user is accessing the rollno");  //this way we can maintain the logs
        return rollno;
    }
    public void setRollno(int rollno){
        System.out.println("rollno is changed");
        this.rollno=rollno;
    }

    public String getName() {
        System.out.println("user is accessing the name");
        return name;
    }

    public void setName(String name) {
        System.out.println("name is changed");
        this.name = name;
    }
    //getters & setters

}
public class EncapsulationDemo {
    public static void main(String[]args){
    Student s1 =new Student();
    s1.setName("pavan");
    s1.setRollno(13);
        System.out.println(s1.getName()+" "+s1.getRollno());
        System.out.println(s1.getRollno());
        System.out.println(s1.getName());
    }
}
