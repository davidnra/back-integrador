package resource;

import org.glassfish.jersey.process.internal.RequestScoped;

import jakarta.ws.rs.core.Response;
import service.PagamentoService;

@RestController
@RequestMapping("/pagamento")
public class PagamentoResource {
    private PagamentoService pagamentoService;

    @Autowired
    public PagamentoResource(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }

    @PostMapping("/pix")
    public Response<String> efetuarPagamentoPix(@RequestScoped PagamentoPixRequest pagamentoRequest) {
        String resultadoPagamento = pagamentoService.efetuarPagamentoPix(pagamentoRequest);
        return new Response<>(resultadoPagamento, HttpStatus.OK);
    }
}

