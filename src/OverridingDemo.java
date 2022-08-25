class SuperClass{
    public void show(){
        System.out.println("in superclass");
    }
}
class SubClass extends SuperClass{
    @Override
    public void show(){
        super.show();  //user super we are calling superclass object to print that method also
        System.out.println("in subclass");
    }
}

public class OverridingDemo {
    public static void main(String[]args){

        SubClass obj = new SubClass();
        obj.show();

    }
}
