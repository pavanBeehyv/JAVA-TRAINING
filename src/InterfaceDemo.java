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
        Writer pc= new Pencil(); //we can create referance of interface but not object of interface
        k.doSomething(p);
        k.doSomething(pc);

    }
}
