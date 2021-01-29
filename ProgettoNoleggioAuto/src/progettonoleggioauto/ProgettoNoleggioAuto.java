package progettonoleggioauto;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgettoNoleggioAuto {

    public static void main(String[] args) {
        creaDatabase();
        creaTabellaCategoria();
        /*
        Frame
        */
    }
    
    private static void creaDatabase(){
        String url;
        url = "jdbc:sqlite:./noleggioauto.db";
        try (Connection conn = DriverManager.getConnection(url)){
            if(conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Database creato con successo");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private static void creaTabellaCategoria(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            System.out.println("Apertura del database avvenuta con successo");
            stmt = c.createStatement();
            String creaCategoria = "CREATE TABLE IF NOT EXISTS categorie (" + "\n"
                    + " id_categoria int auto_increment primary key," + "\n"
                    + " descrizione varchar(50) NOT NULL," + "\n"
                    + " noleggioAlGiorno int NOT NULL," + "\n"
                    + " noleggioAlChilometro int NOT NULL" + "\n"
                    + " );";
            stmt.executeUpdate(creaCategoria);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Tabella creata con successo");
    }
}
