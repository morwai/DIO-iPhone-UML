package navegador;

public class Telefone implements AparelhoTelefonico {

    private void conectarRede(){
        System.out.println("Conectando com a rede");
    };
    public void fazerLigacao(String numero){
        conectarRede();
        System.out.println("Fazendo ligação para o número: " + numero);
    };
    public void aceitarLigacao(){
        System.out.println("Aceitando ligação");
    };
    public void recusarLigacao(){
        System.out.println("Recusando ligação");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Recusando ligação");
    };

}
