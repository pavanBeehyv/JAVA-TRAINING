public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int m =-9,n =9;
        int r = m+n;
        int r1=r-2*m;
        int r2 = r-2*n;
        int a = m++; //a==m & then increment value of m
        int b = ++n; //increment n & assign it's value to b
        System.out.println(a+""+b);
        if(r==0){
            System.out.println("nothing");}
        else if (r % 2 == 0) {
            System.out.println("even");
        }else
            System.out.println("odd");
        b= (a%2==0)?0:1; //ternary operator condition?value1:value2
        System.out.println(b);
        System.out.println(r);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(m/n);
        System.out.println((double)n/m);
        System.out.println(n%m);
    }
}