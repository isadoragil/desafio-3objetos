import java.util.ArrayList;

public class PrincipalProduto {
    public static void main(String[] args) {
        double media = 0;

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Sabonete", 6.50);
        Produto produto2 = new Produto("Shampoo", 15.90);
        Produto protudo3 = new Produto("Condicionador", 20.99);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(protudo3);

        for (Produto item : listaDeProdutos) {
            media += item.getPreco();
        }

        System.out.println("Preço médio: R$" + media/listaDeProdutos.size());
    }
}
