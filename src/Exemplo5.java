import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;
        do {
            System.out.println("Digite 1 para comprar frutas. \n" +
                    "Digite 2 para comprar horti-fruti. \n" +
                    "Digite 3 para comprar trigos e cia. \n" +
                    "Digite 4 para comprar produtos de higiene.");
            int escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu comprar frutas.");
                    break;
                case 2:
                    System.out.println("Você escolheu comprar horti-fruti.");
                    break;
                case 3:
                    System.out.println("Você escolheu comprar trigos e cia.");
                    break;
                case 4:
                    System.out.println("Você escolheu comprar produtos de higiene");
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
            System.out.println("Você deseja digitar um número válido? ");
            resposta = sc.next();
        } while (resposta.equals("sim"));
    }
}
