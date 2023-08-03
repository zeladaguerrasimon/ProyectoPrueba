@Controller
public class CamareroController {
    private final CamareroRepository camareroRepository;

    public CamareroController(CamareroRepository camareroRepository) {
        this.camareroRepository = camareroRepository;
    }

    @GetMapping("/camareros")
    public String listarCamareros(Model model) {
        List<Camarero> camareros = camareroRepository.findAll();
        model.addAttribute("camareros", camareros);
        return "listar_camareros"; // Vista en HTML
    }

}
