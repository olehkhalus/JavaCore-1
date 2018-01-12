//package JDBC;
//
//import model.Author;
//import model.Book;
//
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BookDao {
//        //Logger logger= new Logger();
//
//        public Boolean isBookInLibrary(Book book){
//            Boolean bookInLibrary = false;
//            DBWorker worker = new DBWorker();
//            try (PreparedStatement prepStat=worker.getConnection().prepareStatement("SELECT * FROM books WHERE " +
//                    "id_book =?");){
//                prepStat.setInt(1,book.getId());
//                try (ResultSet result = prepStat.executeQuery()) {
//                    while (result.next()) {
//                        bookInLibrary = true;
//                    }
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return bookInLibrary;
//        }
//
//        public List<Book> getBooksByName(String name) {
//            List<Book> books = new ArrayList<>();
//            DBWorker worker = new DBWorker();
//            try (PreparedStatement prepStat = worker.getConnection().prepareStatement("SELECT * FROM " +
//                    "books JOIN relations USING (id_book) JOIN authors USING (id_author) WHERE book_name =?");) {
//                prepStat.setString(1, name);
//                try (ResultSet resalt = prepStat.executeQuery()) {
//                    while (resalt.next()) {
//                        Book book = new Book();
//                        book.setName(resalt.getString("book_name"));
//                        book.setAuthors(getAuthors(resalt.getInt("id_book")));
//                        books.add(book);
//                    }
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            if (books.isEmpty()) {
//                System.out.println("Sorry, but we have not books by searching name");
//            }
//            return books;
//        }
//
//        public Integer getAuthorId(Author author) {
//            Integer authorId = -1;
//            DBWorker worker = new DBWorker();
//            try (PreparedStatement prepStat = worker.getConnection().prepareStatement("SELECT * FROM authors " +
//                    "where authors.firstname= ? AND authors.lastname= ? " +
//                    "AND authors.country= ?");){
//                prepStat.setString(1, author.getFirstName());
//                prepStat.setString(2, author.getLastName());
//                prepStat.setString(3, author.getCountry().toString());
//                try (ResultSet result = prepStat.executeQuery()) {
//                    while (result.next()) {
//                        authorId = result.getInt("id_author");
//                    }
//                    prepStat.close();
//                    result.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return authorId;
//        }
//
//        public void addAuthor(Author author) {
//            DBWorker worker = new DBWorker();
//            try (PreparedStatement prepStat = worker.getConnection().prepareStatement("INSERT INTO authors (firstname, lastname, country) " +
//                    "VALUES (?, ?, ?)")) {
//                prepStat.setString(1, author.getFirstName());
//                prepStat.setString(2, author.getLastName());
//                prepStat.setString(3, author.getCountry().toString());
//                prepStat.execute();
//                prepStat.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        public void addBook(Book book) {
//            Integer idBookName = -1;
//            for (Author currentAuthor : book.getAuthors()) {
//                if (getAuthorId(currentAuthor) <0) {
//                    addAuthor(currentAuthor);
//                }
//            }
//            DBWorker worker = new DBWorker();
//            try (PreparedStatement statement =worker.getConnection().
//                    prepareStatement("INSERT INTO books (book_name) VALUES (?);", PreparedStatement.RETURN_GENERATED_KEYS);){
//                statement.setString(1,book.getName());
//                statement.execute();
//                try (ResultSet resultSet = statement.getGeneratedKeys()) {
//                    if (resultSet.next()) {
//                        idBookName = resultSet.getInt(1);
//                    }
//                }
//                for (Author currentAuthor : book.getAuthors()) {
//                    try (PreparedStatement statement2 = worker.getConnection().prepareStatement("INSERT INTO relations (id_book, id_author) " +
//                            "VALUES (?, ?);")){
//                        statement2.setInt(1, idBookName);
//                        statement2.setInt(2, getAuthorId(currentAuthor));
//                        statement2.execute();
//                    }
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
////
////                book.setName(result.getString("book_name"));
////                book.setiDBook(result.getInt("id_book"));
////                book.setAuthors(getAuthors(result.getInt("id_book")));
////                books.add(book);
////            }
////            preparedStatement.close();
////            result.close();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
////        return books;
////    }
//
//        public List<Book> getBooks(Author author) {
//            ArrayList<Book> books = new ArrayList<>();
//            DBWorker worker = new DBWorker();
//            try (PreparedStatement preparedStatement = worker.getConnection().prepareStatement("SELECT * FROM authors " +
//                    "JOIN relations USING (id_author) JOIN books USING (id_book) WHERE  authors.firstname =? AND " +
//                    "authors.lastname =? AND authors.country =? ");){
//                preparedStatement.setString(1, author.getFirstName());
//                preparedStatement.setString(2, author.getLastName());
//                preparedStatement.setString(3, author.getCountry().toString());
//                try (ResultSet result = preparedStatement.executeQuery()) {
//                    while (result.next()) {
//                        Book book = new Book();
//                        book.setId(result.getInt("id_book"));
//                        book.setName(result.getString("book_name"));
//                        book.setAuthors(getAuthors(result.getInt("id_book")));
//                        books.add(book);
//                    }
//                    preparedStatement.close();
//                    result.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return books;
//        }
//
//        public List<Author> getAuthors(Integer bookID) {
//            ArrayList<Author> authors = new ArrayList();
//            DBWorker worker = new DBWorker();
//            try (PreparedStatement preparedStatement = worker.getConnection().prepareStatement("SELECT * FROM books " +
//                    "join relations using (id_book) JOIN authors USING (id_author) where books.id_book = ?");){
//                preparedStatement.setInt(1, bookID);
//                try (ResultSet result = preparedStatement.executeQuery()) {
//                    while (result.next()) {
//                        Author author = new Author();
//                        author.setFirstName(result.getString("firstname"));
//                        author.setLastName(result.getString("lastname"));
//                        author.setCountry2((result.getString("country")));
//                        authors.add(author);
//                    }
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            return authors;
//        }
//
//    }
//
//
