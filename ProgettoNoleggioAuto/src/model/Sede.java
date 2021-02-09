package model;
public class Sede {
    private Integer idSede;
    private String indirizzo;

    public Sede(Integer idSede, String indirizzo) {
        this.idSede = idSede;
        this.indirizzo = indirizzo;
    }

    public Integer getIdSede() {
        return idSede;
    }

    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    
}
