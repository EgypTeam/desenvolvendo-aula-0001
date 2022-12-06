import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {

        int sum = 0;

        if (args.length > 0) {

            for (int i = 0; i < args.length; i++) {
                sum = sum + Integer.parseInt(args[i]);
            }
    
            System.out.println(String.format("O valor da soma eh %d", sum));

        } else {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Entre com o proximo numero: ");
            while (scanner.hasNextInt()) {
                int a = scanner.nextInt();
                sum = sum + a;
                System.out.print("Entre com o proximo numero: ");
            }

            System.out.println();
            System.out.println("-----------------------");
            System.out.println(String.format("O valor da soma eh %d", sum));

        }

    }
}
