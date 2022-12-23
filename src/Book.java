import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int dataIssue;

    public Book(String name, Author author, int dataIssue) {
        this.name = name;
        this.author = author;
        this.dataIssue = dataIssue;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getDataIssue() {
        return dataIssue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setDataIssue(int dataIssue) {
        this.dataIssue = dataIssue;
    }

    @Override
    public String toString() {
        return "Название книги: "+name+" Автор: "+author+" Публикация: "+dataIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
