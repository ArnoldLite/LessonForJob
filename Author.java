package lessonsWithAndrey.lessonStream;

public class Author {
    private String name;
    private Book book;


    public Author(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

}
