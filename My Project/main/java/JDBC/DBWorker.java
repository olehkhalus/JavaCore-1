//package JDBC;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class DBWorker {
//
//        private static final String URL = "jdbc:mysql://localhost:3306/libraries?useSSL=false";
//        private static final String USERNAME = "Admin";
//        private static final String PASS = "Admin";
//
//        private Connection connection;
//
//        public DBWorker(){
//            try {
//                connection = DriverManager.getConnection(URL, USERNAME, PASS);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//         public Connection getConnection(){
//         return connection;
//        }
//
//    }
