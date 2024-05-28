package poo;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

        Numero numero = new Numero(0, 0);

        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        while(continuar) {
            String operacao;
            int finalizar = 1;
            double resultado = 0;
        
            System.out.println("");
            System.out.println("\nCALCULADORA");

            try {
                System.out.println("Digite um número para continuar ou 0 para finalizar");
                finalizar = sc.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("\nNúmero inválido, use números com vírgula");
            }
            

            if (finalizar==0){
                continuar = false;
                return;
            }
            System.out.println("Informe o valor do primeiro numero: ");
            numero.setX(sc.nextDouble()); 
            System.out.println("Digite o sinal da operação que deseja realizar ( +, -, *, / ): ");
            operacao = sc.next();
            System.out.println("Informe o valor do segundo numero: ");
            numero.setY(sc.nextDouble());
           
            if (operacaoValida(operacao)) {
                switch (operacao) {
                    case "+":
                        resultado = numero.soma();
                        break;
                    case "-":
                        resultado = numero.subtracao();
                        break;
                    case "*":
                        resultado  = numero.multiplicacao();
                        break;
                    case "/":
                        if (numero.getY() == 0) {
                            System.out.println("Divisão por 0 não é permitida");
                            return;
                    } else {
                            resultado = numero.divisao();      
                    }
                        break;
                }
            } else {
                System.out.println("Operação Inválida");
                return;
            }
    
            if (operacao.equals ("/")){
                System.out.printf("O resultado de " + numero.getX() + " " + operacao + " " + numero.getY() + " é: "+ String.format("%.3f", resultado)); 
            }
            else{
                System.out.printf("O resultado de " + numero.getX() + " " + operacao + " " + numero.getY() + " é: "+ resultado);
            }   
        }
            sc.close();
    }

    public static boolean operacaoValida(String operacao) {
        return operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/");
    }
}