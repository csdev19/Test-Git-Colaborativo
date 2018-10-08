package principal;

import DAO.*;

import java.util.*;

public class PrincipalCambio {

    public static void main(String[] args) {

        List lista;
        Cambio srv = new Cambio();

        try {
            Titles tit = new Titles();
            tit.setPubID(2);
            lista = srv.ListaTitles(tit);
            Iterator it = lista.iterator();

            while (it.hasNext()) {
                tit = (Titles) it.next();
                System.out.println(tit.getIsbn() + ", " + tit.getTitle() + ", " + tit.getPrice());
            }

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

}
