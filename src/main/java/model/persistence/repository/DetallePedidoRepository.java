import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository<Detalle_Pedido, Long> {

    List<Detalle_Pedido> buscarPorPedidoId(Long pedidoId);
}
