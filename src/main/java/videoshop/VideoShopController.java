@Controller
class CatalogController {

    private final VideoCatalog catalog;

    // Konstruktor-Injektion
    CatalogController(VideoCatalog catalog) {
        this.catalog = catalog;
    }

    @GetMapping("/discs")
    String discCatalog(Model model) {
        // catalog.findAll() kommt direkt aus dem Salespoint-Repository
        model.addAttribute("catalog", catalog.findAll());
        return "catalog"; // Verweist auf catalog.html in src/main/resources/templates
    }
}