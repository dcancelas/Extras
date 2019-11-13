package extrasumapar;

public class ExtraSumaPar {
    public static void main(String[] args) {
        int num;
        int suma = 0;
        int i = 0;

        Metodos obx = new Metodos();
            System.out.println("");
            do {
                num = obx.pedirDatos();
                if((num % 2) == 0)  {
                    suma = (suma + num); 
                }
                i++;               
            }while(i < 5);
            if(suma == 0) System.out.println("\nNingún dos números introducidos é par");
            else System.out.println("\nO resultado da suma dos números pares é: "+suma);

    }
}