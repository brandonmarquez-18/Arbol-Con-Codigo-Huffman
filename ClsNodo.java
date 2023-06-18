public class ClsNodo {
    public String dato;
    public ClsNodo izq;
    public ClsNodo der;

    // PARA PODER ,MANDAR LLAMAR LA CLASE SIRVE EL CONSTRUCTOR
    public ClsNodo(String dato) {
        this.dato = dato;
    }

    public ClsNodo getNodoIzquierdo() {
        return izq;
    }

    public ClsNodo getNodoDerecho() {
        return der;
    }

    public void setNodoIzquierdo(ClsNodo nodo) {
        izq = nodo;
    }

    public void setNodoDerecho(ClsNodo nodo) {
        der = nodo;
    }

    public String getDato() {
        return dato;
    }

    public int RetornarAlturaDeArbol(ClsNodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return 1 + Math.max(RetornarAlturaDeArbol(nodo.getNodoIzquierdo()),
                RetornarAlturaDeArbol(nodo.getNodoDerecho()));
    }

}