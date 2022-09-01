public class Yate extends Embarcacion implements Comparable{

    private int camarotes;

    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, Double eslora, Integer anioFabricacion, int camarotes) {
        super(capitan, precioBase, valorAdicional, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate otroYate = (Yate) o;

        if(this.camarotes > otroYate.camarotes){
            return 1;
        }
        else if (this.camarotes < otroYate.camarotes){
            return -1;
        }
        else {
            return 0;
        }
    }
}
