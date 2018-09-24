package p1;

public class Departamento extends Habitacional {

    private final boolean elevador;
    private final int numeroPisos;

    public Departamento(boolean elevador, int numeroPisos,
            int totalDormitorios, int totalEstacionamientos, String cuenta,
            String direccion, double superficie, int tipoAcabados) {
        super(totalDormitorios, totalEstacionamientos, cuenta, direccion,
                superficie, tipoAcabados);
        this.elevador = elevador;
        this.numeroPisos = numeroPisos;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento{" + "elevador=" + elevador
                + ", numeroPisos=" + numeroPisos + '}';
    }

    public boolean isElevador() {
        return elevador;
    }

    @Override
    public double calculaImpuesto(double x) {
        double impuesto = super.calculaImpuesto(x); 
        if (elevador && numeroPisos < 5) {
            impuesto += 1.02;
        }
        
        return impuesto;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

}
