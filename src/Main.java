import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Input a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double deta = quadraticEquation.getDiscriminant();

        if(deta > 0){
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() +
                    " and " + quadraticEquation.getRoot2());
        }
        if(deta == 0)
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
        if(deta < 0)
            System.out.println("The equation no real rool.");
    }
}