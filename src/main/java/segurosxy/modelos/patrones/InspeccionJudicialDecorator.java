
package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.IInspeccion;

public class InspeccionJudicialDecorator extends InspeccionDecorator {

    public InspeccionJudicialDecorator(IInspeccion inspeccion) {
        super(inspeccion);
    }
    
    @Override
    public void inspeccionarCliente() {
        super.inspeccionarCliente();
        System.out.println("Ejecutando inspeccion judicial ...");
    }

}
