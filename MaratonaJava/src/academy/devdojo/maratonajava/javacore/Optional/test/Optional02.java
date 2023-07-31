package academy.devdojo.maratonajava.javacore.Optional.test;

import java.util.Optional;

import academy.devdojo.maratonajava.javacore.Optional.Repository.MangaRepository;
import academy.devdojo.maratonajava.javacore.Optional.domain.Manga;

public class Optional02 {
    public static void main(String[] args) {
        
        Optional<Manga> search = MangaRepository.findByTitle("Boko");
        search.ifPresent(m -> m.setTitle("Boko no Hero 2"));
        System.out.println(search);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("I'm the Legend")
                            .orElseGet(() -> new Manga(4, "I'm the Legend", 10));
            System.out.println(newManga);
    }
}
