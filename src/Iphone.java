import musica.ReprodutorMusical;
import musica.AppleMusic;
import navegador.AparelhoTelefonico;
import navegador.Telefone;
import telefone.NavegadorInternet;
import telefone.Safari;

public class Iphone {
    public static void main(String[] args) {

        // Criando um novo objeto de acordo com a interface
        ReprodutorMusical appleMusic = new AppleMusic();
        NavegadorInternet safari = new Safari();
        AparelhoTelefonico telefone = new Telefone();

        // Funcionalidades Apple Music
        appleMusic.selecionarMusica("BURN IT DOWN - Linkin Park");
        appleMusic.avancarMusica();
        appleMusic.retrocederMusica();
        appleMusic.pausarMusica();

        // Funcionalidades Safari
        safari.fazerPesquisa();
        safari.exibirSite("https://github.com/morwai/DIO-iPhone-UML");
        safari.voltarAba();
        safari.adicionarNovaAba();
        safari.atualizarPagina();

        // Funcionalidades Telefone
        telefone.fazerLigacao("123456789");
        telefone.aceitarLigacao();
        telefone.recusarLigacao();
        telefone.iniciarCorreioVoz();
    }
}