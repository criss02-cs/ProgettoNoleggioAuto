package model;

import java.util.Date;

public class Noleggio {
    private Integer idNoleggio;
    private Integer kmIniziali;
    private Integer kmFinali;
    private Date giornoRiconsegna;
    private Date giornoNoleggio;
    private Integer fkIdCliente;
    private Integer fkIdSedePartenza;
    private Integer fkIdSedeDestinazione;
    private String fkTarga;

    public Noleggio(Integer idNoleggio, Integer kmIniziali, Date giornoRiconsegna, Date giornoNoleggio, Integer fkIdCliente, Integer fkIdSedePartenza, Integer fkIdSedeDestinazione, String fkTarga) {
        this.idNoleggio = idNoleggio;
        this.kmIniziali = kmIniziali;
        this.giornoRiconsegna = giornoRiconsegna;
        this.giornoNoleggio = giornoNoleggio;
        this.fkIdCliente = fkIdCliente;
        this.fkIdSedePartenza = fkIdSedePartenza;
        this.fkIdSedeDestinazione = fkIdSedeDestinazione;
        this.fkTarga = fkTarga;
    }

    public Integer getIdNoleggio() {
        return idNoleggio;
    }

    public void setIdNoleggio(Integer idNoleggio) {
        this.idNoleggio = idNoleggio;
    }

    public Integer getKmIniziali() {
        return kmIniziali;
    }

    public void setKmIniziali(Integer kmIniziali) {
        this.kmIniziali = kmIniziali;
    }

    public Integer getKmFinali() {
        return kmFinali;
    }

    public void setKmFinali(Integer kmFinali) {
        this.kmFinali = kmFinali;
    }

    public Date getGiornoRiconsegna() {
        return giornoRiconsegna;
    }

    public void setGiornoRiconsegna(Date giornoRiconsegna) {
        this.giornoRiconsegna = giornoRiconsegna;
    }

    public Date getGiornoNoleggio() {
        return giornoNoleggio;
    }

    public void setGiornoNoleggio(Date giornoNoleggio) {
        this.giornoNoleggio = giornoNoleggio;
    }

    public Integer getFkIdCliente() {
        return fkIdCliente;
    }

    public void setFkIdCliente(Integer fkIdCliente) {
        this.fkIdCliente = fkIdCliente;
    }

    public Integer getFkIdSedePartenza() {
        return fkIdSedePartenza;
    }

    public void setFkIdSedePartenza(Integer fkIdSedePartenza) {
        this.fkIdSedePartenza = fkIdSedePartenza;
    }

    public Integer getFkIdSedeDestinazione() {
        return fkIdSedeDestinazione;
    }

    public void setFkIdSedeDestinazione(Integer fkIdSedeDestinazione) {
        this.fkIdSedeDestinazione = fkIdSedeDestinazione;
    }

    public String getFkTarga() {
        return fkTarga;
    }

    public void setFkTarga(String fkTarga) {
        this.fkTarga = fkTarga;
    }
}
