package videoshop.catalog;

import org.salespointframework.catalog.Product;
import org.javamoney.moneta.Money;
import jakarta.persistence.Entity;

@Entity
public class Disc extends Product {

    public static enum DiscType { DVD, BLURAY; }

    private DiscType type;
    private int allowedAge; // VERBESSERUNG: Neues Feld für funktionale Logik

    @SuppressWarnings("unused")
    private Disc() {}

    // Konstruktor mit neuem Parameter allowedAge
    public Disc(String name, String image, Money price, DiscType type, int allowedAge) {
        super(name, price);
        this.type = type;
        this.addImage(image);
        this.allowedAge = allowedAge;
    }

    public DiscType getType() {
        return type;
    }

    public int getAllowedAge() {
        return allowedAge;
    }
}
    }
}
