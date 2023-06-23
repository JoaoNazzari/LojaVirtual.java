
import java.util.Scanner;

public class CarrinhoVirtual {

    public static void main(String[] args) {
    
        System.out.print("\033[H\033[2J");
        System.out.println("---------Seja bem vindo a loja virtual do Zé da Manga!----------");
        System.out.println();
        System.out.println();
        Produto produto1 = new Produto("Camiseta Barby Fãnkeira", 129.99);
        Produto produto2 = new Produto("Calça quadrada do Boby Isponja", 359.99);
        Produto produto3 = new Produto("Sandália da Xuxa com pisca pisca e símbolo satânico", 699.99);

        Carrinho carrinho = new Carrinho();

        System.out.println("Lista de Produtos:");
        System.out.println("1. " + produto1.getNome() + " - R$" + produto1.getPreco());
        System.out.println("2. " + produto2.getNome() + " - R$" + produto2.getPreco());
        System.out.println("3. " + produto3.getNome() + " - R$" + produto3.getPreco());

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o número do produto que deseja adicionar ao carrinho (ou 0 para finalizar):");
        int numeroProduto = scanner.nextInt();

        while (numeroProduto != 0) {
            System.out.println("Digite a quantidade:");
            int quantidade = scanner.nextInt();

            if (numeroProduto == 1) {
                carrinho.adicionarItem(produto1, quantidade);
            } else if (numeroProduto == 2) {
                carrinho.adicionarItem(produto2, quantidade);
            } else if (numeroProduto == 3) {
                carrinho.adicionarItem(produto3, quantidade);
            } else {
                System.out.println("Produto inválido.");
            }

            System.out.println("\nDigite o número do produto que deseja adicionar ao carrinho (ou 0 para finalizar):");
            numeroProduto = scanner.nextInt();
        }

        double total = carrinho.calcularTotal();
        System.out.println("\nResumo do Carrinho:");
        for (Produto produto : carrinho.getItens()) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
        System.out.println("Total a ser pago: R$" + total);

        scanner.close();
    }
}