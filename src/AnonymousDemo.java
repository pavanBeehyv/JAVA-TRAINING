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
    }
}
