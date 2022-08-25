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

public class AbstractDemo {
    public static void main(String args[]){
        Human obj = new Man();  //We can't create object of abstract class, we can only inherit abstract class
        obj.walk();
    }

}
