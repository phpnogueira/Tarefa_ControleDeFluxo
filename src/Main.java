import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        Scanner n4 = new Scanner(System.in);


        System.out.println("Digite a primeira nota: ");
        int nota1 = n1.nextInt();

        System.out.println("Digite a segunda nota: ");
        int nota2 = n2.nextInt();

        System.out.println("Digite a terceira nota: ");
        int nota3 = n3.nextInt();

        System.out.println("Digite a quarta nota: ");
        int nota4 = n4.nextInt();

        int media = (nota1+nota2+nota3+nota4) / 4;

        if(media >= 7){
            System.out.println("sua média é " + media + " você está aprovado! ");
        } else if (media >=5 ) {
            System.out.println("sua média é " + media + " você está de recuperação ");
            
        } else if (media < 5 ) {
            System.out.println("sua média é " + media + " você está reprovado ");

    }   }
}