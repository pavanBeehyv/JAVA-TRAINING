 class Calc{
    int i ;
    float j;
    float k; //instance variable
    public float add(){
        k=i+j;
        return k;
    }
    public Calc(){
        i = 4;
        j=2;
    }
    public Calc(double d){
        i=(int)d;
        j= (float) d;

    }
}

public class oops {
    public static void main(String args[]){
        Calc obj;
        obj =new Calc();//constructor called
         float a =obj.add();
        System.out.println(a);
        obj.i=1;
        obj.j=2.5f;
        System.out.println(obj.add());
        Calc obj1 =new Calc(5.8); //polymorphism constructor overloading
        System.out.println(obj1.i+" "+obj1.j+" "+obj1.add());

    }
}
