
class Calc{
    public int add(int ...n){ //variable length arguments
        int sum =0;
        for(int i:n){
            sum+=i;
        }
        return sum;
    }
}
public class VarargsDemo {
    public static void main(String[]args){
    Calc obj = new Calc();
    System.out.println(obj.add(1,3,5,7,9,11)); //we can pass multiple params & it will be taken as array in add method
}}
