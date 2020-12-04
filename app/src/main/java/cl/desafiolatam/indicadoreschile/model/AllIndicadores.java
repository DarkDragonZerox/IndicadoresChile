package cl.desafiolatam.indicadoreschile.model;

public class AllIndicadores {

    private String version;
    private String autor;
    private String fecha;
    private Indicador uf;
    private Indicador ivp;
    private Indicador dolar;
    private Indicador dolarIntercambio;
    private Indicador euro;
    private Indicador ipc;

    public AllIndicadores(String version, String autor, String fecha, Indicador uf, Indicador ivp, Indicador dolar, Indicador dolarIntercambio, Indicador euro, Indicador ipc) {
        this.version = version;
        this.autor = autor;
        this.fecha = fecha;
        this.uf = uf;
        this.ivp = ivp;
        this.dolar = dolar;
        this.dolarIntercambio = dolarIntercambio;
        this.euro = euro;
        this.ipc = ipc;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Indicador getUf() {
        return uf;
    }

    public void setUf(Indicador uf) {
        this.uf = uf;
    }

    public Indicador getIvp() {
        return ivp;
    }

    public void setIvp(Indicador ivp) {
        this.ivp = ivp;
    }

    public Indicador getDolar() {
        return dolar;
    }

    public void setDolar(Indicador dolar) {
        this.dolar = dolar;
    }

    public Indicador getDolarIntercambio() {
        return dolarIntercambio;
    }

    public void setDolarIntercambio(Indicador dolarIntercambio) {
        this.dolarIntercambio = dolarIntercambio;
    }

    public Indicador getEuro() {
        return euro;
    }

    public void setEuro(Indicador euro) {
        this.euro = euro;
    }

    public Indicador getIpc() {
        return ipc;
    }

    public void setIpc(Indicador ipc) {
        this.ipc = ipc;
    }

    @Override
    public String toString() {
        return "AllIndicadores{" +
                "version='" + version + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha='" + fecha + '\'' +
                ", uf=" + uf +
                ", ivp=" + ivp +
                ", dolar=" + dolar +
                ", dolarIntercambio=" + dolarIntercambio +
                ", euro=" + euro +
                ", ipc=" + ipc +
                '}';
    }
}
