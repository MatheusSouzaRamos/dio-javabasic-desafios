package dipositivo;
import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    //telefone
    public void tocarTelefone(){
        System.out.println("TOCANDO");
    }

    public void atender(){
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    // navegador

    public void exibirPagina(){
        System.out.println("EXIBINDO PAGINA");
    }

    public void atualizarPagina(){
        System.out.println("ATUALIZANDO PAGINA");
    }

    public void adicionarNovaAba(){
        System.out.println("ADICIONANDO NOVA ABA");
    }

    // reprodutor musical
    public void tocarMusica(){
        System.out.println("TOCANDO");
    }

    public void pausarMusica(){
        System.out.println("PAUSE");
    }

    public void selecionarMusica(){
        System.out.println("MUSICA SELECIONADA");
    }
}
