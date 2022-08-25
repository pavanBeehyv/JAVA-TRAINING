
public class ArrayDemo {
    public static void main(String[]args){
    //jagged array is containing rows with different no. elements
        int a[][]={
                {1,2,3,4},
                {2,4,6,},
                {2,3,5,7,11}
        };

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        //enhanced for loop
        for(int[] k:a) {
            for(int l:k)
            System.out.print(l+" ");
            System.out.println();
        }

    }
}