import java.util.ArrayList;
import java.util.List;

class Carrinho {
    private List<Produto> itens;  

    public Carrinho() {
        itens = new ArrayList<>();  // Começa lista de itens como um ArrayList vazia
    }

    public void adicionarItem(Produto produto, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            itens.add(produto);  // Adiciona o produto quantas vezes foi pedido
        }
    }

    public List<Produto> getItens() {
        return itens;   
    }

    public double calcularTotal() {
        double total = 0;  

        // getPreco() é somado ao total.
        for (Produto produto : itens) {
            total += produto.getPreco();
        }

        return total;  
    }
}

