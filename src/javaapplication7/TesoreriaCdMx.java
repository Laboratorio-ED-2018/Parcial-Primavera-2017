package p1;

public class TesoreriaCdMx {
    //Puede haber varios atributos

    private final Vivienda viviendasCM[];
    private int tV;         // número de viviendas en el arreglo
    private final int MAX = 100;

    public TesoreriaCdMx() {
        viviendasCM = new Vivienda[MAX];
        tV = 0;
    }

    // Alta "simplificada" de viviendas tipo Casa
    public boolean alta(String cuenta, String direccion, double superficie,
            int tipoAcabados, int totalDormitorios, int totalEstacionamientos,
            boolean jardin) {
        boolean resp = false;
        if (tV < viviendasCM.length) {
            viviendasCM[tV] = new Casa(jardin, totalDormitorios,
                    totalEstacionamientos, cuenta, direccion, superficie,
                    tipoAcabados);
            tV++;
            resp = true;
        }
        return resp;
    }

    // Alta "simplificada" de viviendas tipo Departamento
    public boolean alta(String cuenta, String direccion, double superficie,
            int tipoAcabados, int totalDormitorios, int totalEstacionamientos,
            boolean elevador, int numeroPisos) {
        boolean resp = false;
        if (tV < viviendasCM.length) {
            viviendasCM[tV] = new Departamento(elevador, numeroPisos,
                    totalDormitorios, totalEstacionamientos, cuenta,
                    direccion, superficie, tipoAcabados);
            tV++;
            resp = true;
        }
        return resp;
    }

    //Solución del problema3.2
    public boolean masEstacionamientos() {
        boolean resp=false;
        Habitacional hab;

        for (int i = 0; i < tV; i++) {
            if (viviendasCM[i] instanceof Habitacional) {
                hab= (Habitacional)viviendasCM[i];
                if (resp= hab.getTotalEstacionamientos()>hab.getTotalDormitorios()){
                    resp=true;
                }
            }
            return resp;
        }

        return resp;
    }

    //Solución del problema3.3
    public int totalCasas(double precioM2, double cant) {
        int totalCasas=0;
        Casa casa;
        
        for(int i=0; i<tV; i++){
            if (viviendasCM[i] instanceof Casa){
                casa= (Casa) viviendasCM[i];
                if (cant> casa.calculaImpuestoCasa(precioM2));
                totalCasas+=1; 
            }
        }
        return totalCasas;
    }
}
