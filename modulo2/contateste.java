public class contateste {
    public static void main (String[] args) {
        conta conta = new conta ();
        conta.cliente = "Daniel";
        conta.saldo = 4_000.00;
        conta.exibesaldo ();

        //conta.saque(2000);
        //conta.exibesaldo ();

        //conta.deposito(8000);
        //conta.exibesaldo();

        conta destino = new conta();
        destino.cliente = "Carlos";
        destino.saldo = 5_000.00;
        destino.exibesaldo();
    }

}
