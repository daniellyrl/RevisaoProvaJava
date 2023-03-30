public class Exemplo3 {
    public static void main(String[] args) {
        double nota1 = 7.0;
        double nota2 = 8.0;
        double nota3 = 6.5;
        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("Sua média foi " + media);

        if (media > 7){
            System.out.println("Você foi aprovado");
        } else if (media < 4) {
            System.out.println("Você foi reprovado");
        }
    }
}
