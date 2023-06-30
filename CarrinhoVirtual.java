import java.util.List;
import java.util.Scanner;

public class CarrinhoVirtual {

    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");
        System.out.println("---------Seja bem vindo a loja virtual do Zé da Manga!----------");
        System.out.println();
        System.out.println();

        // Obter a lista de produtos da classe Produto
        List<Produto> produtos = Produto.getProdutos();

        Carrinho carrinho = new Carrinho();

        System.out.println("Lista de Produtos:");
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            System.out.println((i + 1) + ". " + produto.getNome() + " - R$" + produto.getPreco());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nDigite o número do produto que deseja adicionar ao carrinho (ou 0 para finalizar):");
        int numeroProduto = scanner.nextInt();

        while (numeroProduto != 0) {
            if (numeroProduto >= 1 && numeroProduto <= produtos.size()) {
                System.out.println("Digite a quantidade:");
                int quantidade = scanner.nextInt();

                Produto produtoSelecionado = produtos.get(numeroProduto - 1);
                carrinho.adicionarItem(produtoSelecionado, quantidade);
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