import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        switch (str) {
            case "1":
                System.out.println("Hello World!" + str);
                break;
            case "2":
                System.out.println("Hello World!" + str);
                break;
            case "3":
                System.out.println("Hello World!" + str);
                break;
            default:
                System.out.println("Hello World!");
                break;
        }
        scan.close();
    }
}
