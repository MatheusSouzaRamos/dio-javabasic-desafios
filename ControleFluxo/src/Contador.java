import java.util.Scanner;
import java.util.Locale;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o numero1: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o numero2: ");
        int num2 = scanner.nextInt();
        scanner.close();

        try {
            contarNumeros(num1, num2);

        } catch (Exception e) {
            System.out.println("Os numeros informados não são validos, tente novamente");
            System.out.println("o numero1 deve ser menor que o numero2!");
        }

    }

    static void contarNumeros(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2){
            throw new ParametrosInvalidosException();
        }else{
            System.out.println("No intervalo de " + num1 + " até " + num2 + " são " + (num2-num1) +" elementos");
            int contador = num2 - num1;
            for(int i = 1; i <= contador; i++){
                System.out.println("Imprimindo o numero: " + i);
            }
        }
    } 
}
