package academy.devdojo.maratonajava.javacore.Optional.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import academy.devdojo.maratonajava.javacore.Optional.domain.Manga;
@SuppressWarnings("all")
public class MangaRepository {
    private static List<Manga> mangas = List.of(
            new Manga(1, "Boko", 30),
            new Manga(2, "dragon", 40),
            new Manga(3, "OverLord", 50)
            );

    private static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    private static Optional<Manga> findByTitle(String title){
        return findBy(m -> m.getTitle().equals(title));
    }

    private static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
