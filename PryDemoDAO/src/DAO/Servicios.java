package DAO;

import java.sql.*;

import java.util.*;

public class Servicios {

    public static Connection cnBooks() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "mysql");
    } //cnBooks

    public static Connection cnBooksOracle() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "books", "oracle");
    } //cnBooksOracle

    public void actualizaPrecio(Titles t) throws Exception {
        String sql = "update TITLES set PRICE=? where ISBN = ? ";
        Connection cn = cnBooksOracle();
        PreparedStatement pst = cn.prepareStatement(sql);

        pst.setDouble(1, t.getPrice());
        pst.setString(2, t.getIsbn());

        pst.executeUpdate();

        pst.close();
        cn.close();
    } //actualizaPrecio()

    public List ListaTitles() throws Exception {
        List lista = new ArrayList(); //Polimorfismo
        String sql = "select isbn, title, price from titles ";
        Connection cn = cnBooksOracle();
        PreparedStatement pst = cn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        //Copiar el resultset a la coleccion
        Titles tit;
        while (rs.next()) {
            tit = new Titles(rs.getString("isbn"), rs.getString("title"), 0, "", 0, "", rs.getDouble("price"));
            lista.add(tit);
        }//while

        rs.close();
        pst.close();
        cn.close();
        return lista;
    }
}
