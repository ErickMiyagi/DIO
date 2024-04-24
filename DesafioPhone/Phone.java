package DesafioPhone;

public class Phone implements ReprodutorMusica, AparelhoTelefonico, NavegadorDeInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página!");
    }

    @Override
    public void adicionarAbaNova() {
        System.out.println("Adicionando Aba Nova!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando Música!");
    }  
}
