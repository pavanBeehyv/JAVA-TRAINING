class Outer{
    static  int a;
    public void show(){
        System.out.println("outer class method display called");
    }

    static class Inner{    //Outer$Inner.class
        public void display(){
            System.out.println("In display ,inner class");
        }
    }
     class Inner1{
        public void display(){
            System.out.println("In display ,inner1 non-static class");
        }
    }
}


public class InnerDemo {
    public static void main(String[]args){
        Outer obj = new Outer();
        obj.show();
        Outer.Inner obj1= new Outer.Inner();//static inner class instantiation
        obj1.display();
        Outer.Inner1 obj2 =obj.new Inner1(); //non-static inner class instantiation
        obj2.display();
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);
    }
}
