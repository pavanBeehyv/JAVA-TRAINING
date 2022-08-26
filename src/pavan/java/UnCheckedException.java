package pavan.java;

public class UnCheckedException {
    public static void main(String[] args) {
       try {
           int a[] = new int[4];
           a[4] = 5;
           int i = 7;
           int j = 0;
           int k = i / j;
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.err.println("Error:check size of array");
       }
       catch (ArithmeticException e){
           System.out.println("Error:can't divide by 0");
       }
       catch (Exception e){              //can't use this super class Exception catch block first
           System.out.println("something's wrong");
       }
       finally {
           System.out.println("Bye");
       }

    }
}
