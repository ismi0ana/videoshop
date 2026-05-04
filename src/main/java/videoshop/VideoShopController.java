package videoshop.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class CatalogController {

    private final VideoCatalog catalog;

    CatalogController(VideoCatalog catalog) {
        this.catalog = catalog;
    }

    @GetMapping("/discs")
    String discCatalog(Model model) {
        model.addAttribute("catalog", catalog.findAll());
        return "catalog"; 
    }

    // VERBESSERUNG: Funktionale Logik zur Altersprüfung
    @PostMapping("/cart")
    String addDisc(@RequestParam("pid") Disc disc, @RequestParam("number") int number) {
        
        // Wenn der Film ab 18 ist, leiten wir mit einer Fehlermeldung zurück
        if (disc.getAllowedAge() >= 18) {
            return "redirect:/discs?error=age_restriction";
        }

        // Normalerweise würde hier das Item zum Warenkorb hinzugefügt werden
        return "redirect:/discs?success=added";
    }
}
