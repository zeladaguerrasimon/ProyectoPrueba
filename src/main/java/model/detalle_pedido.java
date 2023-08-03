@Entity
public class Detalle_Pedido {
    @EmbeddedId
    private DetallePedidoId id;

    private int cantidad;
    private BigDecimal subtotal;

}
