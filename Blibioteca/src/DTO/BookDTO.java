
package DTO;

public class BookDTO {
    private int id;
    private String title, author, isbn, pages, price;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return title;
    }

    public void setTitulo(String title) {
        this.title = title;
    }

    public String getAutor() {
        return author;
    }

    public void setAutor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPaginas() {
        return pages;
    }

    public void setPaginas(String pages) {
        this.pages = pages;
    }

    public String getPreco() {
        return price;
    }

    public void setPreco(String price) {
        this.price = price;
    }
    
}
