package Lista_Encadenada_Simple;

public class MainListaEncadenadaSimple {
    public static void main(String[] args) {
        ListaEncadenadaSimple listaEncadenadaSimple = new ListaEncadenadaSimple();

        listaEncadenadaSimple.insertarIesimo(10,0);
        listaEncadenadaSimple.insertarIesimo(20,1);
        listaEncadenadaSimple.insertarIesimo(30,2);

        System.out.println(listaEncadenadaSimple.toString());


        System.out.println(listaEncadenadaSimple.menorElem());
    }
}
