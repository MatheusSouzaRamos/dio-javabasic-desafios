import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        try {
            String usuario = scanner.next();
            verificarNumeroConta(usuario);
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }   
        finally {
            scanner.close();
        }
    }
    public static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException{
        if(numeroConta.length() == 8 )
            System.out.println("Numero de conta valido.");
        else
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
    }
}
