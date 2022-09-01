public class Main {
    public static void main(String[] args) {

        //Ver capitan y calcular monto alquiler

        Capitan cap1 = new Capitan("Juan Paco Pedro", "De la mar", "A123");

        Yate yate1 = new Yate(cap1, 25.5,10.5,80.5, 1985, 25);
        Yate yate2 = new Yate(cap1, 35.5,10.4,100.5, 1986, 50);

        System.out.println("El capitán se llama " +yate1.getCapitan().getNombre() + " " + yate1.getCapitan().getApellido() + " y su matrícula es " + yate1.getCapitan().getMatricula());

        System.out.println("El monto de alquiler del yate1 es " + "$"+yate1.calcularMonto());

        //Comparar yates

        int elMasLujoso = yate1.compareTo(yate2);

        if(elMasLujoso == 1)
            System.out.println("El yate1 es el más lujoso");
        else if(elMasLujoso == -1)
            System.out.println("El yate2 es el más lujoso");
        else
            System.out.println("Yate1 y Yate2 son lujosos por igual");

        //Evaluar si un velero es grande

        Velero velero1 = new Velero(cap1, 250.5, 100.3, 95.6, 1990, 6);

        System.out.println("El velero1 es grande: " + velero1.esGrande());


    }
}
