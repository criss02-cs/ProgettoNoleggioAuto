package model;

public class Categoria {
    private Integer idCategoria;
    private String descrizione;
    private Integer noleggioAlGiorno;
    private Integer noleggioAlChilometro;

    public Categoria(Integer idCategoria, String descrizione, Integer noleggioAlGiorno, Integer noleggioAlChilometro) {
        this.idCategoria = idCategoria;
        this.descrizione = descrizione;
        this.noleggioAlGiorno = noleggioAlGiorno;
        this.noleggioAlChilometro = noleggioAlChilometro;
    }

    public Categoria(Integer idCategoria, String descrizione) {
        this.idCategoria = idCategoria;
        this.descrizione = descrizione;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Integer getNoleggioAlGiorno() {
        return noleggioAlGiorno;
    }

    public void setNoleggioAlGiorno(Integer noleggioAlGiorno) {
        this.noleggioAlGiorno = noleggioAlGiorno;
    }

    public Integer getNoleggioAlChilometro() {
        return noleggioAlChilometro;
    }

    public void setNoleggioAlChilometro(Integer noleggioAlChilometro) {
        this.noleggioAlChilometro = noleggioAlChilometro;
    }
}
