package tiposDeCuenta;

public class Estandar implements CreadorDeCuenta {
    @Override
    public Cuenta crear() {
        return new Cuenta(1.5,0.0, null ,0, "Seguro", TipoCuenta.Oro);
    }
}
