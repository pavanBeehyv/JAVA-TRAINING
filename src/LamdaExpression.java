// lambda expressions can be used to represent the instance of a functional interface.
//functional interfaces are there from java 8 onwards
@FunctionalInterface
interface CDE{
    void show();
    default void display(){
        System.out.println("java interface default method");
    }
}
class CdeImpl implements CDE{
    @Override
    public void show() {
        System.out.println("implemented show method");
    }
}
public class LamdaExpression {
    public static void main(String[]args){
        CDE obj =new CDE() {
            @Override
            public void show() {
                System.out.println("implementation of functional interface method");
            }
        };
        obj.show();
        CDE obj1 =()-> System.out.println("removed boiler plate code ,with lamda expression");
        obj1.show(); //above we have created an object of interface in 1 line

        CdeImpl o = new CdeImpl();
        o.show();
        o.display();
    }
}
