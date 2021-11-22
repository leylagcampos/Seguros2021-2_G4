package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.IInspeccion;

public class InspeccionViviendaDecorator extends InspeccionDecorator {

    public InspeccionViviendaDecorator(IInspeccion inspeccion) {
        super(inspeccion);
    }
    
    @Override
    public void inspeccionarCliente() {
        super.inspeccionarCliente();
        System.out.println("Ejecutando inspeccion de vivienda ...");
    }
}
