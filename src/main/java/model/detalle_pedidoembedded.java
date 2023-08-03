@Embeddable
public class DetallePedidoId implements Serializable {
    @Column(name = "pedido_id")
    private Long pedidoID;

    @Column(name = "plato_id")
    private Long platoID;

}
