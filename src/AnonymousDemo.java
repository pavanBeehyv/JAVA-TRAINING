import java.io.Serializable;

interface ABC{
    void show();
}
class Random{
    public void show(){
        System.out.println("in Random show");
    }
} //now we don't want to change the class Random but want different output from show() method.
  // one way we can do it by creating another class & overriding show() but instead we use anonymous class
public class AnonymousDemo {
    public static void main(String []args){
        Random r = new Random(){
            @Override
            public void show() {
                System.out.println("changed show() method log using anonymous class");
            }
        };
        r.show();

        //we can't create an obj of interface because there's no implementation for methods in interface
        // we are using anonymous class to instantiate the interface where implementation of interface done in anonymous class
        ABC obj = new ABC() {
            @Override
            public void show() {
                System.out.println("instantiated interface using anonymous class");
            }
        };
        obj.show();
    }
}
