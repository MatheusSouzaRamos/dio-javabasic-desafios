import dipositivo.Iphone;

public class CelularMatheus {
    public static void main(String[] args) {
        Iphone celular = new Iphone();

        celular.selecionarMusica();
        celular.tocarMusica();
        celular.pausarMusica();

        celular.adicionarNovaAba();
        celular.exibirPagina();
        celular.atualizarPagina();

        celular.tocarTelefone();
        celular.atender();
        celular.iniciarCorreioVoz();
        
    }
}
