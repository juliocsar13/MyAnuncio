package app.material_design.julio.myanuncio;

/**
 * Created by (U) on 31/10/2015.
 */
public class TipoAnuncio {

    private String nombre;
    private String cantidad;

    public TipoAnuncio(String nombre, String cantidad) {

        this.nombre = nombre;
        this.cantidad = cantidad;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return nombre+","+cantidad;
    }
}