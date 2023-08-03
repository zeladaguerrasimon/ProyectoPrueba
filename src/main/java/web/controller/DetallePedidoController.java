@Controller
public class DetallePedidoController {
    private final DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoController(DetallePedidoRepository detallePedidoRepository) {
        this.detallePedidoRepository = detallePedidoRepository;
    }

    @GetMapping("/pedidos/{pedidoId}/detalle")
    public String verDetallePedido(@PathVariable("pedidoId") Long pedidoId, Model model) {
        List<Detalle_Pedido> detalles = detallePedidoRepository.buscarPorPedidoId(pedidoId);
        model.addAttribute("detalles", detalles);
        return "ver_detalle_pedido"; // Vista en HTML
    }
}
