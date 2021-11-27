public class Cuenta {



    private Float porcentajeInteres;
    private Float porcentajeDescubierto ;
    private TipoCuenta tipoCuenta;
    private TarjetaCredito tarjetaCredito ;
    private TarjetaDebito tarjetaDebito ;
    private Regalo regalo;

    public Cuenta(Float porcentajeInteres, Float porcentajeDescubierto, TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito, Regalo regalo, TipoCuenta tipoCuenta) {
        this.porcentajeInteres = porcentajeInteres;
        this.porcentajeDescubierto = porcentajeDescubierto;
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
        this.regalo = regalo;
        this.tipoCuenta = tipoCuenta;
    }
}
