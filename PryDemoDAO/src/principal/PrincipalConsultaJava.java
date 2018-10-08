package principal;

import DAO.*;

import java.util.*;

public class PrincipalConsultaJava {

    public static void main(String[] args) {
        List lista;
        Servicios srv = new Servicios();

        try {
            lista = srv.ListaTitles();
            //mostrar la lista:

            Titles tit;
            Iterator it = lista.iterator();  //Apunta o referencia una fila de la lista. Asigno a mi lista un iterador

            while (it.hasNext()) {
                tit = new Titles();
                tit = (Titles) it.next();
                System.out.println(tit.getIsbn() + ", " + tit.getTitle() + ", " + tit.getPrice());
            }//While
        } catch (Exception ex) {
            System.out.println(ex.toString());;
        }
    }

}
