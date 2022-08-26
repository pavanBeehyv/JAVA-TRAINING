import java.io.Serializable;
//interfaces can now have a non-abstract default method with implementation from java 1.8 onwards
//INTERFACE TYPES
// Normal-having more than 1 abstract methods
//single abstract method -functional interface(from java 1.8) -wherever there's functional interface we can use -Lamda expression-it's aconcept from scala
//marker interface - no abstract method ex: Serializable interface
class bvc implements Serializable {}
interface Writer {   //100% abstract all methods are only declared,undefined
    void write();  // all methods in interface are public abstract by default
}
class Pen implements Writer{
    public void write(){
        System.out.println("i am pen");
    }
}
class Pencil implements Writer{ //multiple interfaces can be implemented
public void write(){
        System.out.println("i am pencil");
        }
}
class Kit{
    public void doSomething(Writer p){
        p.write();

    }
}
public class InterfaceDemo {
    public static void main(String[]args){

        Kit k =new Kit();
        Writer p = new Pen();
        Writer pc= new Pencil(); //we can create reference of interface but not object of interface
        k.doSomething(p);  //we can't create object of an interface, but we can create obj of a class which implements interface
        k.doSomething(pc);

    }
}
