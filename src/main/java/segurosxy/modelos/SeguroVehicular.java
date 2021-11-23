package segurosxy.modelos;

import segurosxy.modelos.interfaces.ICobertura;

public class SeguroVehicular extends Seguro {

    private ICobertura cobertura;

    public SeguroVehicular(String marca, String modelo)    {

        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

    public void calcularCobeturaVehicular( ICobertura cobertura )  {

        cobertura.calculaCobertura();
        
        System.out.println();
    }
    
    @Override
    public String infoSeguroCsv() {
        return String.join("\t",super.infoSeguroCsv()) + "\n" + 
        String.join("\t",marca,modelo,poliza.detallepoliza(),nivelRiesgo);
    }
}
