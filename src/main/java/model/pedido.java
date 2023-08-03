@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mesa_id")
    private Long mesaID;

    @Column(name = "camarero_id")
    private Long camareroID;

    private LocalDate fecha;
    private BigDecimal total;

}
