public class Velero extends Embarcacion{

    private int mastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, Double eslora, Integer anioFabricacion, int mastiles) {
        super(capitan, precioBase, valorAdicional, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    public boolean esGrande(){
        return this.mastiles > 4;
    }
}
