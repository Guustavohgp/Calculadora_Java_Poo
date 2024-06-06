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
            char caracter;
            double resultado = 0;
        
            System.out.println("");
            System.out.println("\nCALCULADORA");
            System.out.println("Deseja Continuar? s/n");
            String input = sc.nextLine();

            if (input.length() != 1) {
                System.out.println("\nUse s ou n");
                sc.nextLine();
                continue;
            }
            caracter = input.charAt(0);
            if (caracter == 'n') {
                continuar = false;
                continue;
            }
            if (caracter != 'n' && caracter != 's') {
                System.out.println("Valor inválido, digite s ou n");
                continue;
            }
            try{
            System.out.println("Informe o valor do primeiro numero: ");
            numero.setX(sc.nextDouble()); 
            System.out.println("Digite o sinal da operação que deseja realizar ( +, -, *, / ): ");
            operacao = sc.next();
            System.out.println("Informe o valor do segundo numero: ");
            numero.setY(sc.nextDouble());
            sc.nextLine();  // Consumir o caractere de nova linha deixado por nextDouble()
            }
            catch(InputMismatchException e){
                System.out.println("Número inválido, use números com vírgula");
                sc.next(); // Limpa a entrada inválida
                continue;
            }
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
                        if (numero.getX() == 0 || numero.getY() ==0) {
                            System.out.println("Divisão por 0 não é permitida");
                            continue;
                    } else {
                            resultado = numero.divisao();      
                    }
                        break;
                }
            } else {
                System.out.println("Operação Inválida");
                continue;
            }
            System.out.printf("O resultado de " + numero.getX() + " " + operacao + " " + numero.getY() + " é: " +resultado);    
        }
            sc.close();
    }

    public static boolean operacaoValida(String operacao) {
        return operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/");
    }
}