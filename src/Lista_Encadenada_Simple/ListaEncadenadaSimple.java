package Lista_Encadenada_Simple;

public class ListaEncadenadaSimple {
    public Nodo prim; //apunta al primer nodo
    public int cantElem; //apunta al ultimo nodo
    public Nodo ult; //cantidad total de nodos

    //constructor
    public ListaEncadenadaSimple() {
        prim = ult = null;
        this.cantElem = 0;
    }

    //imprimir la lista
    public String toString() {
        String s1 = "[";
        Nodo aux = prim;
        while (aux != null) {
            s1 = s1 + aux.elem;
            if (aux.prox != null) {
                s1 = s1 + ",";
            }
            aux = aux.prox; //avanza al siguiente nodo
        }
        return s1 + "]";
    }

    //metodo auxiliar
    public boolean vacia() {
        return prim == null && ult == null;
    }

    //1. metodo para insertar primer nodo en la lista
    public void insertarPrim(int x) {
        if (vacia()) {
            Nodo nodo = new Nodo(x, null);
            prim = ult = nodo;
        } else {
            Nodo nuevoNodo = new Nodo(x, null);
            nuevoNodo.prox = prim;
            prim = nuevoNodo;
        }
        this.cantElem++; //finalmente se incrementa la cantidad de nodos
    }

    //2.metodo para insertar ultimo nodo en la lista
    public void insertarUlt(int x) {
        if (vacia()) {
            Nodo nodo = new Nodo(x, null);
            prim = ult = nodo;
        } else {
            Nodo nuevoNodo = new Nodo(x, null);
            ult.prox = nuevoNodo;
            ult = nuevoNodo;
        }
    }

    public void insertarIesimo(int x, int i) {
        int k = 0;
        Nodo p = prim, ap = null;
        while (p != null && k < i) {
            ap = p;
            p = p.prox;
            k++;
        }
        insertarNodo(x, ap, p);
    }

    public void insertarNodo(int x, Nodo ap, Nodo p) {
        if (ap == null) {
            insertarPrim(x);
        } else {
            if (p == null) {
                insertarUlt(x);
            } else {
                ap.prox = new Nodo(x, p);
                cantElem++;
            }
        }
    }

    public void insertarLugar(int x) {
        Nodo p = prim, ap = null;
        while (p != null && x > p.elem) {
            ap = p;
            p = p.prox;
        }
        insertarNodo(x, ap, p);
    }

    // Método Lógico que devuelve True,
    // si todos los elementos de la lista L1 son iguales.
    public boolean iguales() {
        Nodo p = prim;
        while (p != null && p.prox != null) {
            if (p.elem == p.prox.elem) {
                return true;
            }
            p = p.prox;
        }
        return false;
    }

    //Método que devuelve el menor elemento de la lista L1.
    public int menorElem() {
        Nodo p = prim;
        int menor = p.elem;
        while (p != null) {
            if (p.elem < menor) {
                menor = p.elem;
            }
            p = p.prox;
        }
        return menor;
    }

    //  L1.reemplazar(x, y) : Método que reemplaza todas las ocurrencias del elemento x por el elemento y en la lista L1.
    public void reemplazar(int x, int y) {

    }

}
