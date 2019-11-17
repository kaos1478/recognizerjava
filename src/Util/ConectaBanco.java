package Util;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;

    private final String driver = "org.mysql.Driver";
    private final String root = "jdbc:mysql://127.0.0.1/facial_recognition";
    private final String user = "root";
    private final String pass = "";

    public Connection conn;

    public void conexao() {

        try {
            System.setProperty("jdbc.Driver", driver);
            conn = DriverManager.getConnection(root, user, pass);
            System.out.println("Ok");
        } catch (SQLException e) {
            System.out.println("Error: " + e);

        }

    }

    public void desconecta() {

        try {

            conn.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

    }

    public void executaSQL(String SQL) {
        try {
            stm = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

    }

    public static void main(String[] args) {
        //psvm + TAB

        ConectaBanco conecta = new ConectaBanco();
        conecta.conexao();
    }

}
