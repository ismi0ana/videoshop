// Beispiel aus dem Bereich 'catalog'
import org.salespointframework.catalog.Product;
import jakarta.persistence.Entity;

@Entity
public class Disc extends Product {

    public static enum DiscType { DVD, BLURAY; }

    private DiscType type;

    @SuppressWarnings("unused")
    private Disc() {} // Für JPA

    public Disc(String name, String image, Money price, DiscType type) {
        super(name, price);
        this.type = type;
        this.addImage(image);
    }

    public DiscType getType() {
        return type;
    }
}