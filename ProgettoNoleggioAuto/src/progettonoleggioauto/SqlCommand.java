package progettonoleggioauto;
import java.sql.*;
import java.util.ArrayList;
import model.*;
public class SqlCommand {
    Connection c = null;
    ResultSet rec;
    
    //Metodo per selezionare tutte le sedi
    public ArrayList<Sede> selectSedi(){
        ArrayList<Sede> sedi = null;
        try {
            sedi = new ArrayList<>();
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String select = "SELECT * FROM sedi";
            PreparedStatement ps = c.prepareStatement(select);
            rec = ps.executeQuery();
            while(rec.next()){
                sedi.add(new Sede(rec.getInt(1), rec.getString(2)));
            }
            rec.close();
            ps.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("Problemi durante la select, " + e.getMessage());
        }
        return sedi;
    }
    //Metodo per inserire una sede
    public void inserisciSede(String indirizzo){
        try {
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String insert = "INSERT INTO sedi (indirizzo) values (?)";
            PreparedStatement ps = c.prepareStatement(insert);
            ps.setString(1, indirizzo);
            ps.executeUpdate();
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
    //Metodo per l'estrazione delle categorie
    public ArrayList<Categoria> selectCategorieComboBox(){
        ArrayList<Categoria> categorie = null;
        try {
            categorie = new ArrayList<>();
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String select = "SELECT id_categoria, descrizione FROM categorie";
            PreparedStatement ps = c.prepareStatement(select);
            rec = ps.executeQuery();
            while(rec.next()){
                categorie.add(new Categoria(rec.getInt(1), rec.getString(2)));
            }
            rec.close();
            ps.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("Problemi durante la select, " + e.getMessage());
        }
        return categorie;
    }
    //Metodo per l'estrazione delle auto
    public ArrayList<Auto> selectAuto(){
        ArrayList<Auto> auto = null;
        try {
            auto = new ArrayList<>();
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String select = "SELECT targa, marca, modello, id_categoria, descrizione "
                    + "FROM auto inner join categorie on fk_id_categoria = id_categoria";
            PreparedStatement ps = c.prepareStatement(select);
            rec = ps.executeQuery();
            while(rec.next()){
                auto.add(new Auto(rec.getString(1), rec.getString(2), rec.getString(3), rec.getInt(4), rec.getString(5)));
            }
            rec.close();
            ps.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("Problemi durante la select, " + e.getMessage());
        }
        return auto;
    }
    //Metodo per l'inserimento delle auto
    public void inserisciAuto(String targa, String marca, String modello, Integer fkIdCategoria){
        try {
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String insert = "INSERT INTO auto (targa, marca, modello, fk_id_categoria) values (?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(insert);
            ps.setString(1, targa);
            ps.setString(2, marca);
            ps.setString(3, modello);
            ps.setInt(4, fkIdCategoria);
            ps.executeUpdate();
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
    //Metodo per selezionare tutti i clienti
    public ArrayList<Cliente> selectClienti(){
        ArrayList<Cliente> clienti = null;
        try {
            clienti = new ArrayList<>();
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String select = "SELECT * FROM clienti";
            PreparedStatement ps = c.prepareStatement(select);
            rec = ps.executeQuery();
            while(rec.next()){
                clienti.add(new Cliente(rec.getInt(1), rec.getString(2), rec.getString(3), rec.getInt(4), rec.getDate(5), rec.getInt(6)));
            }
            rec.close();
            ps.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("Problemi durante la select, " + e.getMessage());
        }
        return clienti;
    }
    //Metodo per inserire un nuovo cliente
    public void inserisciClienti(String nome, String cognome, Integer noleggio, Date dataNascita, Integer nPatente){
        try {
            c = DriverManager.getConnection("jdbc:sqlite:./noleggioauto.db");
            String insert = "INSERT INTO clienti (nome, cognome, noleggioAlChilometro, dataN, nPatente) values (?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(insert);
            ps.setString(1, nome);
            ps.setString(2, cognome);
            ps.setInt(3, noleggio);
            ps.setDate(4, dataNascita);
            ps.setInt(5, nPatente);
            ps.executeUpdate();
            ps.close();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}
