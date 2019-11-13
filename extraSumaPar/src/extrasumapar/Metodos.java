package extrasumapar;
import java.util.Scanner;

public class Metodos {

    private int num;
    Scanner sc = new Scanner(System.in);

    public int pedirDatos() {
            System.out.print("Introduce un número: ");
                num = sc.nextInt();
            return num;
    }
}