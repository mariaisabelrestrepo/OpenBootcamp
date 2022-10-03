public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void aumentarPuertas(){
       numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public static void main(String[] args) {
        Coche miCoche=new Coche(4);
        miCoche.aumentarPuertas();
        System.out.println(miCoche.numPuertas);
    }
}


