import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("teste 1");
        lista.add("teste 2");
        lista.add("teste 3");

        for (String item : lista) {
            System.out.println(item);
        }

        /*Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            System.out.println(animal);
        } else {
            System.out.println(animal);
        } */

        Cachorro cachorro = new Cachorro();
        Animal animal = new Cachorro(); //true
        //Animal animal = new Animal(); //false

        if (animal instanceof Cachorro) {
            animal = (Cachorro) cachorro;
        }








    }
}
