package cuenta;

import tarjetas.TarjetaCredito;
import tarjetas.TarjetaDebito;
import tiposDeCuenta.TipoCuenta;

public class Cuenta {



    private Double porcentajeInteres;
    private Double porcentajeDescubierto ;
    private TipoCuenta tipoCuenta;
    private TarjetaCredito tarjetaCredito ;
    private TarjetaDebito tarjetaDebito ;
    private Regalo regalo;

    public Cuenta(Double porcentajeInteres, Double porcentajeDescubierto, TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito, Regalo regalo, TipoCuenta tipoCuenta) {
        this.porcentajeInteres = porcentajeInteres;
        this.porcentajeDescubierto = porcentajeDescubierto;
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
        this.regalo = regalo;
        this.tipoCuenta = tipoCuenta;
    }
}
