package segurosxy.modelos;

public class FormaPagoDebidoAutomatico implements IFormaPago {

    public void realizaDescuentoAutomaticoBanco() {
        System.out.println("Genera cargo en la cuenta de debito automatico");
    }

    public void generaCuponPago() {

        throw new UnsupportedOperationException();
    }

    public void programaFechaVencimientoCuponPago() {

        throw new UnsupportedOperationException();
    }
}
