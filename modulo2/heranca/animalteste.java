package heranca;

public class animalteste {
    public static void main(String[] args) {

        cachorro lulu = new cachorro();
        lulu.comida = "Ração";
        lulu.dormi();

        galinha cocorico = new galinha();
        cocorico.dormi();

        coruja zoiao = new coruja();
        zoiao.comida = "Milho";
        zoiao.fazerbarulho();
        zoiao.dormi();
        zoiao.peso = 5;
    }
}
