import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static List<Produto> getProdutos() {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Camiseta Barby Fãnkeira", 129.99));
        produtos.add(new Produto("Calça quadrada do Boby Isponja", 359.99));
        produtos.add(new Produto("Sandália da Xuxa com pisca pisca e símbolo satânico", 699.99));
        return produtos;
    }
}
