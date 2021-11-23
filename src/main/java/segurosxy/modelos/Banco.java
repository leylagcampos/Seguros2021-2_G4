package segurosxy.modelos;
import java.util.Arrays;

public class Banco {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Juan Perez");
  

    
    SeguroVehicular segv = new SeguroVehicular("Toyota", "Yaris");
    segv.cacularRiesgo();
    segv.poliza = new Poliza(1111, cliente.getNombre(), cliente.getNombre() );
    segv.certificado = new Certificado();
    cliente.setCompraSeguro(segv);

    CSVadapterByte adapter = new CSVadapterByte(segv);
    recibirDatos(adapter.infoSeguroByte());
  }

  public static void recibirDatos(byte[] dato) {
    System.out.println("Array de bytes recibidos: " + Arrays.toString(dato) + "\n");
    System.out.println("Mensaje decodificado:\n " + new String(dato));
  }
}
