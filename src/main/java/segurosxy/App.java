package segurosxy;

import segurosxy.modelos.Cliente;
import segurosxy.modelos.SeguroVehicular;

public class App {

    public static void main( String[] args )
    {

        Cliente cliente = new Cliente("Juan Perez");
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.cacularRiesgo();
        cliente.setCompraSeguroVehicular(seguro);
        cliente.getListaSeguroCliente();

    }

}
