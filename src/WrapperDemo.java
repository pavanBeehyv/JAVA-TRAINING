import static java.lang.Integer.parseInt;

// int , float ,double
// Integer,
public class WrapperDemo {
    public static void main(String args[]){
    int i = 4; //primitive dataType
    Integer j= new Integer(5); //boxing or Wrapping
        int jj =j.intValue(); //unBoxing or unWrapping
        System.out.println(jj);
        Integer ii= new Integer(i);  //boxing or Wrapping
        Integer value = i; //AutoBoxing or AutoWrapping
        int k=value; //AutoUnBoxing


        String str ="127";
        int n =Integer.parseInt(str);  //parseInt is a static method of Integer class which is used to parse string to integer
        System.out.println(n);

    }
}
//  WHY USING WRAPPER CLASSES: certain applications & frameworks don't support primitives