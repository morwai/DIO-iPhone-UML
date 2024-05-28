package telefone;

public class Safari implements NavegadorInternet {

    private void conectarInternet(){
        System.out.println("Conectando internet");
    };
    public void fazerPesquisa(){
        conectarInternet();
        System.out.println("Fazendo pesquisa");
    };
    public void exibirSite(String url){
        conectarInternet();
        System.out.println("Acessando site: " + url);
    };
    public void voltarAba(){
        System.out.println("Voltando para a aba anterior");
    };
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    };
    public void atualizarPagina(){
        System.out.println("Atualizando página");
    };

}
