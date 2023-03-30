public class Exemplo2 {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 4;
        int n3 = 6;
        if (n1 > n2 && n1 > n3){
            System.out.println("O " + n1 + " é maior");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O " + n2 + " é maior");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O " + n3 + " é maior");
        }
        if (n1 < n2 && n1 < n3){
            System.out.println("O " + n1 + " é menor");
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("O " + n2 + " é menor");
        } else if (n3 < n1 && n3 < n2) {
            System.out.println("O " + n3 + " é menor");
        }
    }
}
