public class Exemplo1 { //Exemplo na classe
    public static void main(String[] args) {
        int num1 = 20; //Com os valores amarrados e sem a interação com o usuário
        int num2 = 40;
        int total;
        total = num1 + num2;
        System.out.println("O total da soma foi " + total);
        if (num1 > num2){
            System.out.println("O " + num1 + " é maior");
        }else if (num2 > num1){
            System.out.println("O " + num2 + " é maior");
        } else if (num1 == num2) {
            System.out.println("O " + num1 + " é igual ao " + num2);
        }
    }
}
