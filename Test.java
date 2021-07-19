package lessonsWithAndrey.lessonStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Author> list = new ArrayList<Author>(){{
            Book one = new Book(237);
            Book two = new Book(564);
            Book three = new Book(322);
            Book four = new Book(134);
            Book five = new Book(851);
            add(new Author("Pushkin", one));
            add(new Author("Dostoevskiy", two));
            add(new Author("Lermontov", three));
            add(new Author("Gogol", four));
            add(new Author("Po", five));
            add(new Author("PushkinBrother", one));
            add(new Author("DostoevskiySister", two));
            add(new Author("LermontovFather", three));
            add(new Author("GogolMother", four));
            add(new Author("PoSun", five));
        }};

        List<Integer>bookPageCount = list.stream()
                .map((author -> author.getBook().getPageCount()))
                .collect(Collectors.toList());

        int sum = 0;
        for(Integer integer : bookPageCount){
            sum += integer;
        }

        System.out.println(sum);
    }
}
