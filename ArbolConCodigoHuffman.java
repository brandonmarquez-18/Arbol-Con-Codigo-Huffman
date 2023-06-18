import java.util.ArrayList;//LIBRERIA PARA ARRAYLIST
import java.util.Collections;//ORDENAR LOS ARRAYLIST
import javax.swing.JOptionPane;//VENTANAS

public class ArbolConCodigoHuffman {
    public static void main(String[] args) {
        // CREAMOS ARRAYLIST PARA SUSTITUIR CARACTERES POR LOS VALORES CORRESPONDIENTES
        ArrayList<String> Caracter = new ArrayList<>();
        // AÑADIMOS AL ARRAYLIST LOS CARACTERES CON EL METODO .add
        Caracter.add("@");
        Caracter.add("$");
        Caracter.add("%");
        Caracter.add("/");
        Caracter.add("´´");
        Caracter.add("!");
        Caracter.add("•");

        // CREAMOS ARRAYLIST PARA LAS FRECUENCIAS INICIALES
        ArrayList<Integer> Frecuencias = new ArrayList<>();
        // AÑADIMOS AL ARRAYLIST LAS FRECUENCIAS CON EL METODO .add
        Frecuencias.add(2);
        Frecuencias.add(6);
        Frecuencias.add(3);
        Frecuencias.add(7);
        Frecuencias.add(8);
        Frecuencias.add(12);

        /*
         * CREAMOS LOS DIFERENTES ARRAYLIST PARA LOS DIFERENTES DESGLOZES DE
         * LOS DOS VALORES MENORES E IRLOS ALMACENADOLOS EN UNA NUEVA LISTA
         * HASTA QUE SOLO QUEDEN DOS VALORES
         */
        ArrayList<Integer> Frecuencias5Valores = new ArrayList<>();
        ArrayList<Integer> Frecuencias4Valores = new ArrayList<>();
        ArrayList<Integer> Frecuencias3Valores = new ArrayList<>();
        ArrayList<Integer> Frecuencias2Valores = new ArrayList<>();

        /*
         * PASOS DE LA CODIDICACIÓN HUFFMAN:
         * 
         * 1.- ACOMODAR LAS FRECUENCIAS DE MENOR A MAYOR.
         * 2.- SUMAR LOS DOS VALORES MENORES DE LAS FRECUENCIAS
         * 3.- REPETIR LOS DOS PASOS ANTERIORES HASTA QUE SOLO QUEDEN
         * DOS VALORES PARA POSTERIORMENTE IR ARMANDO EL ÁRBOL
         */
        JOptionPane.showMessageDialog(null, "1.- ACOMODAR LAS FRECUENCIAS DE MENOR A MAYOR.\n"
                + "2.- SUMAR LOS DOS VALORES MENORES DE LAS FRECUENCIAS.\n"
                + "3.- REPETIR LOS DOS PASOS ANTERIORES HASTA QUE SOLO QUEDEN DOS VALORES PARA POSTERIORMENTE IR ARMANDO EL ÁRBOL.");

        System.out.println("EJECUTANDO DESARROLLO DEL CÓDIGO HUFFMAN...\n");
        JOptionPane.showMessageDialog(null, "EJECUTANDO DESARROLLO DEL CÓDIGO HUFFMAN...");

        // ACOMODAMOS LASFRECUENCIAS
        System.out.println("LISTA DE FRECUENCIAS ORIGINALES: \n" + Frecuencias);
        JOptionPane.showMessageDialog(null, "LISTA DE FRECUENCIAS ORIGINALES: \n" + Frecuencias);
        // USAMOS LA LIBRERIA Collections PARA ACOMODAR EL ARRAYLIST
        Collections.sort(Frecuencias);// metodo "Collections" para ordenar arraylist
        System.out.println("\nLISTA DE FRECUENCIAS ORDENADAS:\n" + Frecuencias + "\n[" + Frecuencias.get(0) + " + "
                + Frecuencias.get(1) + "]");
        JOptionPane.showMessageDialog(null, "\nLISTA DE FRECUENCIAS ORDENADAS:\n" + Frecuencias + "\n["
                + Frecuencias.get(0) + " + " + Frecuencias.get(1) + "]");
        // ARRALIST 5 VALORES:
        /*
         * PRIMERO SUMAMOS LOS VALORES MENORES DE LAS FRECUENCIAS DE 6 VALORES
         * Y LOS VALORES RESTANTES TAMBIEN SE LE AÑADEN A ESTE ARRAYLIST
         */
        Frecuencias5Valores.add(Frecuencias.get(0) + Frecuencias.get(1));
        Frecuencias5Valores.add(Frecuencias.get(2));
        Frecuencias5Valores.add(Frecuencias.get(3));
        Frecuencias5Valores.add(Frecuencias.get(4));
        Frecuencias5Valores.add(Frecuencias.get(5));
        System.out.println("\nEL RESULTADO YA ESTÁ ORDENADO:\n" + Frecuencias5Valores + "\n["
                + Frecuencias5Valores.get(0) + " + " + Frecuencias5Valores.get(1) + "]");
        JOptionPane.showMessageDialog(null, "\nEL RESULTADO YA ESTÁ ORDENADO:\n" + Frecuencias5Valores + "\n["
                + Frecuencias5Valores.get(0) + " + " + Frecuencias5Valores.get(1) + "]");
        // ARRAYLIST 4 VALORES:
        /*
         * PRIMERO SUMAMOS LOS VALORES MENORES DE LAS FRECUENCIAS DE 5 VALORES
         * Y LOS VALORES RESTANTES TAMBIEN SE LE AÑADEN A ESTE ARRAYLIST
         */
        Frecuencias4Valores.add(Frecuencias5Valores.get(0) + Frecuencias5Valores.get(1));
        Frecuencias4Valores.add(Frecuencias5Valores.get(2));
        Frecuencias4Valores.add(Frecuencias5Valores.get(3));
        Frecuencias4Valores.add(Frecuencias5Valores.get(4));
        // MOSTRAMOS EL ARRAYLIST DESORDENADO:
        System.out.println("\nFRECUENCIAS DESORDENADAS:\n" + Frecuencias4Valores);
        JOptionPane.showMessageDialog(null, "\nFRECUENCIAS DESORDENADAS:\n" + Frecuencias4Valores);
        // LO ORDENAMOS:
        Collections.sort(Frecuencias4Valores);
        // MOSTRAMOS EL ARRAYLIST ORDENADO:
        System.out.println("\nFRECUENCIAS ORDENADAS:\n" + Frecuencias4Valores + "\n[" + Frecuencias4Valores.get(0)
                + " + " + Frecuencias4Valores.get(1) + "]");
        JOptionPane.showMessageDialog(null, "\nFRECUENCIAS ORDENADAS:\n" + Frecuencias4Valores + "\n["
                + Frecuencias4Valores.get(0) + " + " + Frecuencias4Valores.get(1) + "]");
        // ARRAYLIST 3 VALORES
        /*
         * PRIMERO SUMAMOS LOS VALORES MENORES DE LAS FRECUENCIAS DE 4 VALORES
         * Y LOS VALORES RESTANTES TAMBIEN SE LE AÑADEN A ESTE ARRAYLIST
         */
        Frecuencias3Valores.add(Frecuencias4Valores.get(0) + Frecuencias4Valores.get(1));
        Frecuencias3Valores.add(Frecuencias4Valores.get(2));
        Frecuencias3Valores.add(Frecuencias4Valores.get(3));
        // MOSTRAMOS EL ARRAYLIST DESORDENADO:
        System.out.println("\nFRECUENCIAS DESORDENADAS:\n" + Frecuencias3Valores);
        JOptionPane.showMessageDialog(null, "\nFRECUENCIAS DESORDENADAS:\n" + Frecuencias3Valores);
        Collections.sort(Frecuencias3Valores);
        // MOSTRAMOS EL ARRAYLIST ORDENADO:
        System.out.println("\nFRECUENCIAS ORDENADAS:\n" + Frecuencias3Valores + "\n[" + Frecuencias3Valores.get(0)
                + " + " + Frecuencias3Valores.get(1) + "]");
        JOptionPane.showMessageDialog(null, "\nFRECUENCIAS ORDENADAS:\n" + Frecuencias3Valores + "\n["
                + Frecuencias3Valores.get(0) + " + " + Frecuencias3Valores.get(1) + "]");
        // ARRAYLIST 2 VALORES:
        /*
         * PRIMERO SUMAMOS LOS VALORES MENORES DE LAS FRECUENCIAS DE 3 VALORES
         * Y LOS VALORES RESTANTES TAMBIEN SE LE AÑADEN A ESTE ARRAYLIST
         */
        Frecuencias2Valores.add(Frecuencias3Valores.get(0) + Frecuencias3Valores.get(1));
        Frecuencias2Valores.add(Frecuencias3Valores.get(2));
        // MOSTRAMOS EL ARRAYLIST DESORDENADO:
        System.out.println("\nFRECUENCIAS DESORDENADAS:\n" + Frecuencias2Valores);
        JOptionPane.showMessageDialog(null, "\nFRECUENCIAS DESORDENADAS:\n" + Frecuencias2Valores);
        Collections.sort(Frecuencias2Valores);
        // MOSTRAMOS EL ARRAYLIST ORDENADO:
        System.out.println("\nFRECUENCIAS ORDENADAS:\n" + Frecuencias2Valores);
        JOptionPane.showMessageDialog(null, "\nFRECUENCIAS ORDENADAS:\n" + Frecuencias2Valores);
        System.out.println("\n\n");

        /// EXPLICO YO

        // CREACION DE NODOS
        ClsNodo NodoInicial = new ClsNodo("•");
        ClsNodo Nodo1 = new ClsNodo(Frecuencias2Valores.get(0).toString());
        ClsNodo Nodo2 = new ClsNodo(Frecuencias4Valores.get(0).toString());
        ClsNodo Nodo3 = new ClsNodo(Frecuencias4Valores.get(1).toString());
        ClsNodo Nodo4 = new ClsNodo(Frecuencias2Valores.get(1).toString());
        ClsNodo Nodo5 = new ClsNodo(Frecuencias3Valores.get(0).toString());
        ClsNodo Nodo6 = new ClsNodo(Frecuencias5Valores.get(0).toString());
        ClsNodo Nodo7 = new ClsNodo(Frecuencias.get(0).toString());
        ClsNodo Nodo8 = new ClsNodo(Frecuencias.get(1).toString());
        ClsNodo Nodo9 = new ClsNodo(Frecuencias5Valores.get(1).toString());
        ClsNodo Nodo10 = new ClsNodo(Frecuencias3Valores.get(1).toString());

        // ASIGNACIÓN DE NODOS

        // LADO IZQUIERDO
        NodoInicial.setNodoIzquierdo(Nodo1);
        Nodo1.setNodoIzquierdo(Nodo2);
        Nodo2.setNodoDerecho(Nodo3);

        // LADO DERECHO
        NodoInicial.setNodoDerecho(Nodo4);
        Nodo4.setNodoIzquierdo(Nodo5);
        Nodo5.setNodoIzquierdo(Nodo6);
        Nodo6.setNodoIzquierdo(Nodo7);
        Nodo7.setNodoDerecho(Nodo8);
        Nodo5.setNodoDerecho(Nodo9);
        Nodo4.setNodoDerecho(Nodo10);

        int RepetirMenu = 1;
        while (RepetirMenu == 1) {
            int Opcion = 0;
            try {
                Opcion = Integer.parseInt(JOptionPane.showInputDialog("ELIGE UNA OPCIÓN DEL MENÚ:\n"
                        + "1.- MOSTRAR TABLA DE CARÁCTER Y FRECUENCIA.\n"
                        + "2.- PINTAR ÁRBOL.\n"
                        + "3.- PINTAR ÁRBOL SUSTITUIDO POR CARÁCTERES\n"
                        + "4.- CONSULTAR ALTURA DEL ÁRBOL.\n"
                        + "5.- BUSCAR ELEMENTO DEL ÁRBOL.\n"
                        + "6.- SALIR."));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "SOLO SE ACEPTAN NÚMEROS");
            }
            switch (Opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "CARÁCTER  |  FRECUENCIA\n"
                            + "         " + Caracter.get(0) + "          |            " + Frecuencias.get(0) + "\n"
                            + "         " + Caracter.get(1) + "            |            " + Frecuencias.get(1) + "\n"
                            + "         " + Caracter.get(2) + "           |            " + Frecuencias.get(2) + "\n"
                            + "         " + Caracter.get(3) + "             |            " + Frecuencias.get(3) + "\n"
                            + "         " + Caracter.get(4) + "           |            " + Frecuencias.get(4) + "\n"
                            + "         " + Caracter.get(5) + "             |           " + Frecuencias.get(5) + "\n");
                    break;
                case 2:
                    preOrder(NodoInicial);
                    break;
                case 3:
                    // SUSTITUCION DE VALOR POR CARACTER
                    Nodo2 = new ClsNodo(Caracter.get(3));
                    Nodo3 = new ClsNodo(Caracter.get(4));
                    Nodo7 = new ClsNodo(Caracter.get(0));
                    Nodo8 = new ClsNodo(Caracter.get(2));
                    Nodo10 = new ClsNodo(Caracter.get(5));
                    Nodo9 = new ClsNodo(Caracter.get(1));
                    Nodo1 = new ClsNodo(Caracter.get(6));
                    Nodo4 = new ClsNodo(Caracter.get(6));
                    Nodo5 = new ClsNodo(Caracter.get(6));
                    Nodo6 = new ClsNodo(Caracter.get(6));

                    // ASIGNACIÓN DE NODOS

                    // LADO IZQUIERDO
                    NodoInicial.setNodoIzquierdo(Nodo1);
                    Nodo1.setNodoIzquierdo(Nodo2);
                    Nodo2.setNodoDerecho(Nodo3);

                    // LADO DERECHO
                    NodoInicial.setNodoDerecho(Nodo4);
                    Nodo4.setNodoIzquierdo(Nodo5);
                    Nodo5.setNodoIzquierdo(Nodo6);
                    Nodo6.setNodoIzquierdo(Nodo7);
                    Nodo7.setNodoDerecho(Nodo8);
                    Nodo5.setNodoDerecho(Nodo9);
                    Nodo4.setNodoDerecho(Nodo10);

                    preOrder(NodoInicial);

                    break;
                case 4:
                    int resul = NodoInicial.RetornarAlturaDeArbol(NodoInicial);

                    JOptionPane.showMessageDialog(null, "LA ALTURA DEL ÁRBOL ES: " + (resul - 1));
                    break;
                case 5:
                    String CaracterABuscar = JOptionPane.showInputDialog(null,
                            Caracter + "\nDIGITA EL CARACTER A BUSCAR:");
                    for (int i = 0; i < Caracter.size(); i++) {
                        if (CaracterABuscar == null ? Caracter.get(i) == null
                                : CaracterABuscar.equals(Caracter.get(i))) {
                            JOptionPane.showMessageDialog(null, "CARÁCTER ENCONTRADO EN LA POSICIÓN:" + (i));
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "CARÁCTER NO ENCONTRADO EN LA POSICIÓN:" + (i));
                        }
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "ABUENO ADIÓS MASTER ***C VA....");
                    RepetirMenu = 0;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPCIÓN NO VÁLIDA, SOLO DEL 1 AL 6");
                    break;
            }
        }
    }

    public static void preOrder(ClsNodo raiz) {
        if (raiz != null) {
            System.out.println(raiz.getDato() + " (RAÍZ)\n<");
            preOrder(raiz.getNodoIzquierdo());
            System.out.print("\n>");
            preOrder(raiz.getNodoDerecho());
        }
    }
}