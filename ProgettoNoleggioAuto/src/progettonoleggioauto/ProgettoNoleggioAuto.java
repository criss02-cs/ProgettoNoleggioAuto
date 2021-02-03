package progettonoleggioauto;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgettoNoleggioAuto {

    public static void main(String[] args) {
        //Creazione del database
        creaDatabase();
        //Creazione delle tabelle del database
        creaTabellaCategoria();
        creaTabellaSede();
        creaTabellaCliente();
        creaTabellaAuto();
        creaTabellaNoleggio();
        //Creazione della frame e visualizzazione di essa
        FrameMenu fm = new FrameMenu();
        fm.setVisible(true);
        fm.setTitle("Menù Gestionale noleggi auto");
    }
    
    private static void creaDatabase(){
        String url;
        url = "jdbc:sqlite:./noleggioauto.db";
        try (Connection conn = DriverManager.getConnection(url)){
            if(conn != null){
                DatabaseMetaData meta = conn.getMetaData();
                //System.out.println("Database creato con successo");
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
            //System.out.println("Apertura del database avvenuta con successo");
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
        //System.out.println("Tabella creata con successo");
    }
    
    private static void creaTabellaSede(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            //System.out.println("Apertura del database avvenuta con successo");
            stmt = c.createStatement();
            String creaCategoria = "CREATE TABLE IF NOT EXISTS sedi (" + "\n"
                    + " id_sede int auto_increment primary key," + "\n"
                    + " indirizzo varchar(50) NOT NULL" + "\n"
                    + " );";
            stmt.executeUpdate(creaCategoria);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        //System.out.println("Tabella creata con successo");
    }
    
    private static void creaTabellaCliente(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            //System.out.println("Apertura del database avvenuta con successo");
            stmt = c.createStatement();
            String creaCategoria = "CREATE TABLE IF NOT EXISTS clienti (" + "\n"
                    + " id_clienti int auto_increment primary key," + "\n"
                    + " nome varchar(50) NOT NULL," + "\n"
                    + " cognome int NOT NULL," + "\n"
                    + " noleggioAlChilometro int NOT NULL," + "\n"
                    + " dataN date NOT NULL," + "\n"
                    + " nPatente varchar(50) NOT NULL UNIQUE" + "\n"
                    + " );";
            stmt.executeUpdate(creaCategoria);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        //System.out.println("Tabella creata con successo");
    }
    
    private static void creaTabellaAuto(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            //System.out.println("Apertura del database avvenuta con successo");
            stmt = c.createStatement();
            String creaCategoria = "CREATE TABLE IF NOT EXISTS auto (" + "\n"
                    + " targa varchar(7) primary key," + "\n"
                    + " marca varchar(50) NOT NULL," + "\n"
                    + " modello varchar(50) NOT NULL," + "\n"
                    + " fk_id_categoria int," + "\n"
                    + " foreign key (fk_id_categoria) references categorie(id_categoria)"
                    + " );";
            stmt.executeUpdate(creaCategoria);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        //System.out.println("Tabella creata con successo");
    }
    
    private static void creaTabellaNoleggio(){
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            //System.out.println("Apertura del database avvenuta con successo");
            stmt = c.createStatement();
            String creaCategoria = "CREATE TABLE IF NOT EXISTS noleggi (" + "\n"
                    + " id_noleggio int auto_increment primary key," + "\n"
                    + " kmIniziali int NOT NULL," + "\n"
                    + " kmFinali int," + "\n"
                    + " giornoRiconsegna date," + "\n"
                    + " giornoNoleggio date NOT NULL," + "\n"
                    + " fk_id_cliente int NOT NULL," + "\n"
                    + " fk_id_sedePartenza int NOT NULL," + "\n"
                    + " fk_id_sedeDestinazione int NOT NULL," + "\n"
                    + " fk_targa varchar(7) NOT NULL," + "\n"
                    + " foreign key (fk_id_cliente) references clienti(id_clienti),"
                    + " foreign key (fk_id_sedePartenza) references clienti(id_sede),"
                    + " foreign key (fk_id_sedeDestinazione) references clienti(id_sede),"
                    + " foreign key (fk_targa) references clienti(targa)"
                    + " );";
            stmt.executeUpdate(creaCategoria);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        //System.out.println("Tabella creata con successo");
    }
}
