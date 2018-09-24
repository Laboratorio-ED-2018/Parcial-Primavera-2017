package p1;

public abstract class Habitacional extends Vivienda{
    private final int totalDormitorios, totalEstacionamientos;

    public Habitacional(int totalDormitorios, int totalEstacionamientos, 
            String cuenta, String direccion, double superficie, 
            int tipoAcabados) {
        super(cuenta, direccion, superficie, tipoAcabados);
        this.totalDormitorios = totalDormitorios;
        this.totalEstacionamientos = totalEstacionamientos;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nHabitacional{" + "totalDormitorios=" + totalDormitorios + 
                ", totalEstacionamientos=" + totalEstacionamientos + '}';
    }

    public int getTotalDormitorios() {
        return totalDormitorios;
    }

    public int getTotalEstacionamientos() {
        return totalEstacionamientos;
    }
    
  
            
        
    }

