package segurosxy.modelos;

public class CSVadapterByte {

  private final Seguro seguro;

  public CSVadapterByte(Seguro seguro) {
    this.seguro = seguro;
  }

  public Seguro getSeguro() {
    return seguro;
  }

  public byte[] infoSeguroByte() {
    return seguro.infoSeguroCsv().getBytes();
  }

}
