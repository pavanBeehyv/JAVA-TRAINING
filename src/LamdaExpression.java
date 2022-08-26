@FunctionalInterface
interface CDE{
    void show();
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
    }
}
