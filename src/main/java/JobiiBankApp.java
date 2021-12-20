import java.util.Scanner;

public class JobiiBankApp {

    public static void main(String[] args) {

        JobiiAccount obj = new JobiiAccount("Null", "000000", "0000");
        obj.showMenu();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println("Value = " + c);
    }
}


