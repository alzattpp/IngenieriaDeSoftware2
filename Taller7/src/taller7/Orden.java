package taller7;

import java.util.Date;

public class Orden {
    private Date fecha;
    private String lugarOrigen;
    private String lugarDestino;

    public Orden(Date fecha, String lugarOrigen, String lugarDestino) {
        this.fecha = fecha;
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }
}
