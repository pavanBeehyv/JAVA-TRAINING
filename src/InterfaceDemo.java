class Calculator{   //super,parent,base
    public int add(int i,int j){
        return i+j;
    }
}
class CalcAdv extends Calculator{  //sub,child,Derived
    public int sub(int i,int j){
        return i-j;
    }
}
class AdvCalc extends CalcAdv{
    public int multiply(int i ,int j){
        return i*j;
    }
}
public class InterfaceDemo {
    public static void main(String args[]){
    AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(8,4));
        System.out.println(obj.sub(8,4));
        System.out.println(obj.multiply(8,4));
    }
}
