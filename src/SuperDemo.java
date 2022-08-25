class A{
    public A(){
        System.out.println("in A");
    }
    public A(int i){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int i){
        super(i);
        System.out.println("in B int");
    }
}
public class SuperDemo {
    public static void main(String args[]){
    B obj =new B(1); //both the constructors of child & parent class are called with obj creation of child class
                    //this is due to presence of default super() method in child class
    }
}
