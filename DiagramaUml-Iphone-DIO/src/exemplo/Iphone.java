package exemplo;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	@Override
	public void tocarMusica() {
		System.out.println("Tocando Música");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Música pausada");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica Selecionada");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página web");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova página adicionada");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada!");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");

	}

	@Override
	public void atender() {

		System.out.println("Atender ligação");
	}

	@Override
	public void inciarCorreioVoz() {
		System.out.println("Abrindo correio de voz");

	}

}
