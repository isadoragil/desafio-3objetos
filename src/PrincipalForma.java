import java.util.ArrayList;

public class PrincipalForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(4);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma item: listaDeFormas) {
            System.out.println("A área é: " + item.calcularArea());
        }
    }
}
