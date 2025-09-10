import java.util.Scanner;
public class Pages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();
        scanner.close();

        int pages = (100 - age);
        System.out.println(age + "-year olds should read at least " + pages + " pages before giving up on a book.");
    }
}
