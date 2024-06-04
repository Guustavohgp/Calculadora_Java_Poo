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
            
            // usando try catch para lidar com exceção de erro caso seja um número com ponto "1.0"
            try{
                System.out.println("Digite um número para continuar ou 0 para finalizar");
                finalizar = sc.nextInt();
            } 
            catch (InputMismatchException e) {
                System.out.println("Número inválido, use números com vírgula");
                sc.next();  // limpar o scanner
                continue;   // recomeçar o loop
            }
            // lógica para finalizar o loop 
            if (finalizar==0){
                continuar = false;
                return;
            }
            try{
                System.out.println("Informe o valor do primeiro numero: ");
                numero.setX(sc.nextDouble()); 
            }catch (InputMismatchException e){
                System.out.println("Número inválido, use números com vírgula");
                sc.next();  
                continue;   
            }
            System.out.println("Digite o sinal da operação que deseja realizar ( +, -, *, / ): ");
            operacao = sc.next();
            try{
                System.out.println("Informe o valor do segundo numero: ");
            numero.setY(sc.nextDouble());
            }catch(InputMismatchException e){
                System.out.println("Número inválido, use números com vírgula");
                sc.next();  
                continue;   
            }
            sc.close(); // finalizando scanner

            // conferindo se a operação é válida
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
                        if (numero.getX() == 0 || numero.getY() == 0) {
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
    }
    // criando operações válidas
    public static boolean operacaoValida(String operacao) {
        return operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/");
    }
}
