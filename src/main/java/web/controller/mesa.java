@Controller
public class MesaController {
    private final MesaRepository mesaRepository;

    public MesaController(MesaRepository mesaRepository) {
        this.mesaRepository = mesaRepository;
    }

    @GetMapping("/mesas")
    public String listarMesas(Model model) {
        List<Mesa> mesas = mesaRepository.findAll();
        model.addAttribute("mesas", mesas);
        return "listar_mesas"; // Vista en HTML
    }

    @GetMapping("/mesas/nueva")
    public String formularioNuevaMesa(Model model) {
        model.addAttribute("mesa", new Mesa());
        return "nueva_mesa"; // Vista en HTML
    }

    @PostMapping("/mesas/guardar")
    public String guardarMesa(@ModelAttribute Mesa mesa) {
        mesaRepository.save(mesa);
        return "redirect:/mesas";
    }
}
