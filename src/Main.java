public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 0;
        char a ='A';
        String s ="abc";
        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 'A':
                System.out.println("char & string allowed in switch");
                break;
            default:
                System.out.println("no match");

        }
    }
}