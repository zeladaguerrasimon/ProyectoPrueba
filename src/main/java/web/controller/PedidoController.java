@Controller
public class PedidoController {
    private final PedidoRepository pedidoRepository;

    public PedidoController(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @GetMapping("/pedidos")
    public String listarPedidos(Model model) {
        List<Pedido> pedidos = pedidoRepository.findAll();
        model.addAttribute("pedidos", pedidos);
        return "listar_pedidos"; // Vista en HTML
    }

    @PostMapping("/pedidos/buscar")
    public String buscarPedidos(@RequestParam(name = "parametro") String parametro, Model model) {
        List<Pedido> pedidos = pedidoRepository.buscarPorParametro(parametro);
        model.addAttribute("pedidos", pedidos);
        return "listar_pedidos"; // Vista en HTML
    }
}
