import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Width");
        width = scanner.nextFloat();
        System.out.println("enter Height");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is " + area);
    }
}
