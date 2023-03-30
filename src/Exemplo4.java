public class Exemplo4 {
    public static void main(String[] args) {
        double salario = 2500;
        if (salario < 900){
            System.out.println("Isento");
        } else if (salario > 901 && salario <= 1500) {
            double desconto = salario * 0.95;
            System.out.println("Seu desconto foi de 5%. \n" +
                    " Seu sálario ficou: " + desconto);
        } else if (salario > 1501 && salario <= 2500) {
            double desconto = salario * 0.9;
            System.out.println("Seu desconto foi de 10%. \n" +
                    " Seu sálario ficou: " + desconto);
        } else {
            double desconto = salario * 0.8;
            System.out.println("Seu desconto foi de 20%. \n" +
                    " Seu sálario ficou: " + desconto);
        }
    }
}
