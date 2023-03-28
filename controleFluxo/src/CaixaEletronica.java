public class CaixaEletronica {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println ("Novo Saldo: R$" + saldo);
        }
        else    
            System.out.println ("Saldo Insuficiente");
         
    
    }
}
