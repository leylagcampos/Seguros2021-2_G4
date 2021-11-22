package segurosxy.modelos.patrones;

import segurosxy.modelos.interfaces.IInspeccion;

public class InspeccionFinanciera implements IInspeccion  {
    
    @Override
    public void inspeccionarCliente() {
        System.out.println("Ejecutando inspeccion financiera ...");
    }

}
