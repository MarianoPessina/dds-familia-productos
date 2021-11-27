package tiposDeCuenta;

public class la10 implements CreadorDeCuenta {
    @Override
    public Cuenta crear() {
        return new Cuenta(1.5,0.0, {60, 0.6} ,0, "Seguro", TipoCuenta.Oro);
    }
}
