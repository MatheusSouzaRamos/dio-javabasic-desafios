import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0;
        boolean execute = true; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (execute) { 

            int opcao = scanner.nextInt(); 
        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
            
            switch (opcao){

                case 1:{
                    //deposito
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }

                case 2: {
                    double saque = scanner.nextDouble();
                    if(saldo > saque){
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: " + saldo);
                    } 
                    else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                }

                case 3: {
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }

                case 0: {
                    System.out.println("Programa encerrado.");
                    execute = false;
                    break;
                }

                default:{
                    System.out.println("Opção inválida. Tente novamente."); 
                    break;
                }
            }
        }
    }
}