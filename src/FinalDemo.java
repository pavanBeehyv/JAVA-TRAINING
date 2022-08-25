//final can be used with variables,methods,classes
final class F{ //final classes can't be extended ,someone can't take credit from final classes
    public void show(){  //
        System.out.println("in Final class show ");
    }
}
class Ra {
    public final void show(){     //final method can't be overriden
        System.out.println(" this is final method");

    }
}
class pa extends Ra{
//    public void show(){
//
//    }
    final double PI; //Declared final variable it is like constant
    public pa(){
        PI=3.14; //final variable once initiated cannot be changed
    }
}
public class FinalDemo {
    public static void main(String []args){
    F obj =new F();

    }
}
