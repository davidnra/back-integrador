package service;

public class PagamentoService {

    public String efetuarPagamentoPix(PagamentoPixRequest pagamentoRequest) {

        double valor = pagamentoRequest.getValor();
        String descricao = pagamentoRequest.getDescricao();
        String emailPagador = pagamentoRequest.getEmailPagador();  
        boolean pagamentoBemSucedido;
        
        
		if (pagamentoBemSucedido) {
            return "Pagamento realizado com sucesso!";
        } else {
            return "Falha no pagamento. Por favor, tente novamente.";
        }
    }
}
