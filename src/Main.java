import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double soma=0;
        int quantidade=0;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite a quantidade de veiculos: ");
            quantidade = sc.nextInt();

            while (quantidade > 50) {
                System.out.println("O limite Max é 50!");
                System.out.println("Digite novamente: ");
                quantidade = sc.nextInt();
            }

        sc.nextLine();

        Carro[] vetor = new Carro[quantidade];

        for (int i=0;i<quantidade;i++){
            vetor[i] = new Carro();
            System.out.println("Digite o nome do carro: ");
            vetor[i].nomeCarro = sc.nextLine();

            System.out.println("Digite o preco do veiculo: ");
            vetor[i].preco = sc.nextDouble();
            sc.nextLine();

            soma=soma+vetor[i].preco;

        }
        System.out.println("\n===RESULTADOS===");
        System.out.println("\nNome dos Veiculos: ");
        for (int i=0;i<quantidade;i++) {
            System.out.println("- " + vetor[i].nomeCarro);

        }

        System.out.println("\nQuantidade de veiculos: " + quantidade);
        System.out.println("Valor total de veiculos: " + soma);

    }
}