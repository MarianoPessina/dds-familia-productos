public class Oro implements CreadorDeCuenta{
    @Override
    public Cuenta crear() {
        return new Cuenta(1.5,0.0, {60, 0.6} ,0, "Seguro", Oro);
    }
}
