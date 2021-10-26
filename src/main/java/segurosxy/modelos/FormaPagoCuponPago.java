package segurosxy.modelos;

public class FormaPagoCuponPago implements IFormaPago {

    public void realizaDescuentoAutomaticoBanco() {

        throw new UnsupportedOperationException();
    }

    public void generaCuponPago() {

        System.out.println("Genera Cupon de pago 1");
        System.out.println("Genera Cupon de pago 2");
    }

    public void programaFechaVencimientoCuponPago() {

        System.out.println("Programa fecha de vencimiento cupon 1 en julio 2020");
        System.out.println("Programa fecha de vencimiento cupon 2 en agosto 2020");
    }
}
