package segurosxy;

import segurosxy.modelos.interfaces.IInspeccion;

public class VentaSeguro {
    
    IInspeccion inspeccion;

    public VentaSeguro(IInspeccion inspeccion) {
        this.inspeccion = inspeccion;
    }
    
    public void aprobarSeguro() {
        this.inspeccion.inspeccionarCliente();
    }
}
