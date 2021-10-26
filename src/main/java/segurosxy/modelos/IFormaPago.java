package segurosxy.modelos;

public interface IFormaPago {

    public void realizaDescuentoAutomaticoBanco();
    public void generaCuponPago();
    public void programaFechaVencimientoCuponPago();
}
