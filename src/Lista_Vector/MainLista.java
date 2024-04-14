package Lista_Vector;

public class MainLista {
    public static void main(String[] args) {
        Lista lista = new Lista(10);
        Lista lista2 = new Lista(10);

        lista.insertarIesimo(10,0);
        lista.insertarIesimo(20,1);
        lista.insertarIesimo(30,2);
        lista.insertarIesimo(40,3);
        lista.insertarIesimo(50,4);
        System.out.println(lista.toString());

        lista2.insertarIesimo(1,0);
        lista2.insertarIesimo(2,1);
        lista2.insertarIesimo(3,2);
        System.out.println(lista2.toString());

        lista.insertarIesimo2(lista2,3);
        System.out.println("Lista mesclada : " + lista.toString());
    }
}
