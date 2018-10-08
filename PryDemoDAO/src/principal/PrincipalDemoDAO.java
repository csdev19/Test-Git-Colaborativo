package principal;

import DAO.*;

public class PrincipalDemoDAO {

    public static void main(String[] args) {
        Titles tit = new Titles();
        Servicios srv = new Servicios();

        tit.setIsbn("0130895725");
        tit.setPrice(100);

        try {
            srv.actualizaPrecio(tit);
            System.out.println("Actualizado");
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

}
