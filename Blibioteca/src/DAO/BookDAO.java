package DAO;

import DTO.BookDTO;
import java.awt.print.Book;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;

public class BookDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<BookDTO> book = new ArrayList<>();

    public void cadastrarLivro(Book livro) {
        try {
            String query = "INSERT INTO book (title, author, isbn, pages, price) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, livro.getTitle());
            statement.setString(2, livro.getAuthor());
            statement.setString(3, livro.getIsbn());
            statement.setInt(4, livro.getPages());
            statement.setDouble(5, livro.getPrice());
            statement.executeUpdate();
            System.out.println("Livro cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar livro: " + e.getMessage());
        }
    }

    public List<Book> listarLivros() {
        List<Book> livros = new ArrayList<>();
        try {
            String query = "SELECT * FROM book";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Book livro = new Book();
                livro.setId(resultSet.getInt("id"));
                livro.setTitle(resultSet.getString("title"));
                livro.setAuthor(resultSet.getString("author"));
                livro.setIsbn(resultSet.getString("isbn"));
                livro.setPages(resultSet.getInt("pages"));
                livro.setPrice(resultSet.getDouble("price"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar livros: " + e.getMessage());
        }
        return livros;
    }

    public Book buscarLivro(int id) {
        Book livro = null;
        try {
            String query = "SELECT * FROM book WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                livro = new Book();
                livro.setId(resultSet.getInt("id"));
                livro.setTitle(resultSet.getString("title"));
                livro.setAuthor(resultSet.getString("author"));
                livro.setIsbn(resultSet.getString("isbn"));
                livro.setPages(resultSet.getInt("pages"));
                livro.setPrice(resultSet.getDouble("price"));
            } else {
                System.out.println

    public void excluirLivro(BookDTO livro) {
        String query = "SELECT * FROM book WHERE id=?";

        conn = new ConexaoDAO().ConectaBD();
        try {
            pstm = conn.prepareStatement(query);

            pstm.setInt(1, excluirlivro.getId());

            pstm.execute();

            pstm.close();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EXCLUIR LIVRO " + erro);
        }

    }
}
