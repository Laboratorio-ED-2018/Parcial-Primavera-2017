package p1;

public class Casa extends Habitacional {

    private final boolean jardin;

    public Casa(boolean jardin, int totalDormitorios,
            int totalEstacionamientos, String cuenta, String direccion,
            double superficie, int tipoAcabados) {
        super(totalDormitorios, totalEstacionamientos, cuenta, direccion,
                superficie, tipoAcabados);
        this.jardin = jardin;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCasa{" + "jardin=" + jardin + '}';
    }

    public boolean isJardin() {
        return jardin;
    }

    @Override
    public double calculaImpuesto(double x) {
        double impuesto = super.calculaImpuesto(x);
        if (jardin && getTotalEstacionamientos() > 2) {
            impuesto *= 1.03;
        }
        
        return impuesto;
    }
}
