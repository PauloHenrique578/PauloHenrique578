package beck.end;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        String operacao, resultado;

        System.out.println("====CALCULADORA====)");

        System.out.println("Informe o primeiro numero\n");
        num1 = scanner.nextDouble();

        System.out.println("Informe o segundo numero\n");
        num2 = scanner.nextDouble();

        System.out.println("Informe a operação(+, -, *, /)\n");
        operacao = scanner.next();

        switch (operacao) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }



        }
    }