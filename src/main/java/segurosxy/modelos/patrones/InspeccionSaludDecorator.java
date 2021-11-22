
package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.IInspeccion;

public class InspeccionSaludDecorator extends InspeccionDecorator {

    public InspeccionSaludDecorator(IInspeccion inspeccion) {
        super(inspeccion);
    }
    
    public void inspeccionarCliente() {
        super.inspeccionarCliente();
        System.out.println("Ejecutando inspeccion de salud");
    }

}
