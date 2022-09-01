public abstract class Embarcacion {

    protected Capitan capitan;
    protected Double precioBase;
    protected Double valorAdicional;
    protected Double eslora;
    protected Integer anioFabricacion;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, Double eslora, Integer anioFabricacion) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
    }

    public Double calcularMonto(){
        if(anioFabricacion < 2020){
            return precioBase;
        }
        else {
            return precioBase + valorAdicional;
        }
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Double getEslora() {
        return eslora;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }
}
