//Why abstract class?
// to have classes with unimplemented generic methods which can be later implemented after the abstract class is extended.
//object creation or instantiation of abstract class isn't allowed because to avoid bugs
// since abstract class might have unimplemented methods
abstract class Human{

    abstract public void walk(); //if a method is not defined that need to be abstract

    public void eat(){  // & if a method in a class is abstract the class should also be abstract ,vice-versa not needed

    }
}     //Man class is called concrete class
class Man extends Human{  //when extending abstract class either inheritor class need to be abstract
                            // or the abstract method of the extended class need to be implemented
    public void walk(){
        System.out.println("man is walking");
    }

}

class Printer{
    public void show(Number i){ //Here Number is ABSTRACT class which is used by Float,Integer,Double,Long,Byte,Short
        System.out.println(i);
    }
}

public class AbstractDemo {
    public static void main(String[] args){
        Human obj = new Man();  //We can't create object of abstract class, we can only inherit abstract class
        obj.walk();
        int i;
        float j=  10.6f; //primitive datatypes
        Float k; //class which extends number
        Printer p = new Printer();
        p.show(1.9); // here you can pass any number i.e either float,double,Integer because all these classes extends Number class
    }

}
