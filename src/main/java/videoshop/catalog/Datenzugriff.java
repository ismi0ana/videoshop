import org.salespointframework.catalog.Catalog;

public interface VideoCatalog extends Catalog<Disc> {
    // Hier könnten eigene Abfragen stehen, z.B.
    Iterable<Disc> findByType(Disc.DiscType type);
}