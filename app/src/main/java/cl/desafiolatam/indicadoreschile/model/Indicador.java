package cl.desafiolatam.indicadoreschile.model;

import com.google.gson.annotations.SerializedName;

public class Indicador {

    private String codigo;
    private  String nombre;
    @SerializedName("unidad_medida")
    private  String unidadMedida;
    private String fecha;
    private float valor;

    public Indicador(String codigo, String nombre, String unidadMedida, String fecha, float valor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadMedida = unidadMedida;
        this.fecha = fecha;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Indicador{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", fecha='" + fecha + '\'' +
                ", valor=" + valor +
                '}';
    }
}
