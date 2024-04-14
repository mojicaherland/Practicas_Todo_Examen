package Lista_Vector;

public class Lista {
    private int max;
    private int cantElement;
    private int[] arreglo;

    //Constructor
    public Lista(int max) {
        this.max = max;
        this.cantElement = 0;
        this.arreglo = new int[max];
    }

    //imprimir la lista
    public String toString() {
        String s1 = "[";
        int i = 0;
        while (i < this.cantElement) {
            if (i == this.cantElement - 1) {
                s1 = s1 + this.arreglo[i];
            } else {
                s1 = s1 + this.arreglo[i] + ", ";
            }
        }
        return s1 + "]";
    }
}
