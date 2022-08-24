class Emp{
    int eid;
    int salary;
    static String ceo; //static variables are same for all the objects
    static{//when u load a class
//        eid =1; //non static variables can't be used from static context
        ceo="pavan";
        System.out.println("static block called only once");
    }
    public Emp(){   //when u create a object
        eid=3;
        salary=300;
        System.out.println("in constructor default");
    }
    public Emp(int i,int salary){
        this.salary=salary;
        eid=i;
    }
    public void show(){
        System.out.println(eid+" "+salary+ " "+ceo);
    }
}
public class oops {
    public static void main(String args[]) {
        Emp navin = new Emp();
        navin.eid=5;
        navin.salary=400;
        navin.show();
        Emp rocky =new Emp(2,500);
        rocky.show();
    }
}
