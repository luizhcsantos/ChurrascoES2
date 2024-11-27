public class Membro {

	private private int idMembro;

	private private String nome;

	private private String email;

	private private String senha;

	private private String endereço;

	private private String telefone;

	private CategoriaAlimentar categoriaAlimentar;

	private TipoUsuario tipoUsuario;

	private StatusPagamento statusPagamento;

	private Pagamento[] pagamento;

	private Participante[] participante;

	private Evento[] evento;

	public void login(String email, String senha) {

	}

	public void atualizarDados(String endereco, String telefone) {

	}

	public void selecionarCategoriaAlimentar(CategoriaAlimentar novaCategoria) {

	}

	public StatusPagamento consultarPagamento() {
		return null;
	}

	public Evento criarEvento(Evento evento) {
		return null;
	}

	public void finalizarEvento(Evento evento) {

	}

	public void alterarDadosEvento(Evento evento) {

	}

	public StatusParticipante atualizarStatus() {
		return null;
	}

	public void cancelarInscricao(Evento evento) {

	}

	public CategoriaAlimentar consultarCategoriaALimentar() {
		return null;
	}

	public void responderConvite(StatusParticipante resposta) {

	}

	public void calcularDivisaoCustos() {

	}

	public Relatório solicitarRelatorio(Relatório tipoRelatorio) {
		return null;
	}

	public void realizarPagamento(float valor) {

	}

	public void verificarDevedor(Participante participante) {

	}

	public void redefinirSenha(String novaSenha) {

	}

	public void registrarConvidado(String nomeCompleto, String telefone) {

	}

	public void aceitarRecusarCargo() {

	}

	public void solicitarExclusao() {

	}

}
