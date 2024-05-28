package musica;

public class AppleMusic implements ReprodutorMusical {

    private void reproduzirMusica(){
        System.out.println("Reproduzindo música");
    };
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música: " + musica);
        reproduzirMusica();
    };
    public void avancarMusica(){
        System.out.println("Avançando música");
        reproduzirMusica();
    };
    public void retrocederMusica(){
        System.out.println("Retrocedendo música");
        reproduzirMusica();
    };
    public void pausarMusica(){
        System.out.println("Pausando música");
    };


}
