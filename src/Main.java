public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int m =-9,n =9;
        int r = m+n;
        int r1=r-2*m;
        int r2 = r-2*n;
        if(r==0){
            System.out.println("nothing");}
        else if (r % 2 == 0) {
            System.out.println("even");
        }else
            System.out.println("odd");

        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(m/n);
        System.out.println((double)n/m);
        System.out.println(n%m);
    }
}