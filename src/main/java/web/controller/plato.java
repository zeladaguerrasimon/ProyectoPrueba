@Controller
public class PlatoController {
    private final PlatoRepository platoRepository;

    public PlatoController(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }

    @GetMapping("/platos")
    public String listarPlatos(Model model) {
        List<Plato> platos = platoRepository.findAll();
        model.addAttribute("platos", platos);
        return "listar_platos"; // Vista en HTML
    }

    @GetMapping("/platos/nuevo")
    public String formularioNuevoPlato(Model model) {
        model.addAttribute("plato", new Plato());
        return "nuevo_plato"; // Vista en HTML
    }

    @PostMapping("/platos/guardar")
    public String guardarPlato(@ModelAttribute Plato plato) {
        platoRepository.save(plato);
        return "redirect:/platos";
    }
}
