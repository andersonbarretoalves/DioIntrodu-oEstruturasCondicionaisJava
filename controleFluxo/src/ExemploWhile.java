import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while ( mesada > 0) {
            double valorDocce = valorAleatorio ();

            if (valorDocce > mesada)
                valorDocce = mesada;

            System.out.println("Doce do Valor: " + valorDocce + " Adicionado no carrinho");
            mesada = mesada - valorDocce;
        }

        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda sua Mesada em Doces.");

    }

    private static double valorAleatorio () {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
        
}
