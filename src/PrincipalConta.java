import java.util.ArrayList;

public class PrincipalConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("1", 1900);
        ContaBancaria conta2 = new ContaBancaria("2", 4500);
        ContaBancaria conta3 = new ContaBancaria("3", 5000);
        ContaBancaria conta4 = new ContaBancaria("4", 3400);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);

        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);

        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.printf("A conta de maior saldo é da conta %s: R$%.2f", contaMaiorSaldo.getConta(), contaMaiorSaldo.getSaldo());
    }
}
