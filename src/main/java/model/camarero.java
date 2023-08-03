@Entity
public class Camarero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int edad;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

}
