package p1;

public abstract class Vivienda {

    private final String cuenta, direccion;
    private final double superficie;
    private final int tipoAcabados;

    public Vivienda(String cuenta, String direccion, double superficie,
            int tipoAcabados) {
        this.cuenta = cuenta;
        this.direccion = direccion;
        this.superficie = superficie;
        this.tipoAcabados = tipoAcabados;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "cuenta=" + cuenta + ", direccion=" + direccion
                + ", superficie=" + superficie
                + ", tipoAcabados=" + tipoAcabados + '}';
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getTipoAcabados() {
        return tipoAcabados;
    }

    //solución problema 3.1
    //x represanta el precio de metros**2
    public double calculaImpuesto(double x) {
        double impuesto = x * getSuperficie();
        // Estaba como un if, NetBeans da la opción de cambiarlo (Alt+Enter)
        switch (tipoAcabados) {
            case 1:
                impuesto = x * 1.05;
                break;
            case 2:
            case 3:
                impuesto = x * 1.12;
                break;
            default:
                impuesto = x * 1.18;
                break;
        }
        return impuesto;
    }
}
