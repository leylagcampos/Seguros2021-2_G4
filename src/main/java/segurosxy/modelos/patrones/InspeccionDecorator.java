
package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.IInspeccion;

public class InspeccionDecorator implements IInspeccion {
    
    public final IInspeccion inspeccion;
    
    public InspeccionDecorator(IInspeccion inspeccion){
        
        this.inspeccion = inspeccion;
        
    }
    
    @Override
    public void inspeccionarCliente() {
        
        this.inspeccion.inspeccionarCliente();
        
    }

}
