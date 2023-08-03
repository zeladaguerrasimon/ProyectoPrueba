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

    @GetMapping("/pedidos/nuevo")
    public String formularioNuevoPedido(Model model) {
        model.addAttribute("pedido", new Pedido());
        return "nuevo_pedido"; // Vista en HTML
    }

    @PostMapping("/pedidos/guardar")
    public String guardarPedido(@ModelAttribute Pedido pedido) {
        pedidoRepository.save(pedido);
        return "redirect:/pedidos";
    }
}
