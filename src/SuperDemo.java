class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("in B");
    }
}
class C extends A{
    public void show(){
        System.out.println("in C");
    }
}
public class SuperDemo {
    public static void main(String args[]){
    A obj =new B(); //runtime polymorphism
    obj.show();
    obj =new C();  //once changing object it's changing calling
    obj.show();     // this is called as Dynamic method dispatch


    }
}
