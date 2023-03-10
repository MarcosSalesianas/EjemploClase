import java.util.Random;

public class CComision extends Comercial {
    private int marcaAcuerdo;

    public CComision(String nombre) {
        super(nombre);
        this.marcaAcuerdo = acuerdoEspecial();
        this.ganancias = calcularVentas();
    }

    public int acuerdoEspecial() {
        Random r = new Random();
        int marcaAcuerdo = r.nextInt(0, 3)+1;
        return marcaAcuerdo;
    }

    @Override
    public double calcularVentas() {
        double importeVentas=0;
        for (int i=0; i<unidadesVendidas.length; i++) {
            
            if (i == marcaAcuerdo) {
                if (unidadesVendidas[i] >= 5) {
                    importeVentas += (unidadesVendidas[i] / 5) * 20;
                    importeVentas += (unidadesVendidas[i] % 5) * 10;
                } else {
                    importeVentas += unidadesVendidas[i] * 10;
                }
            } else {
                importeVentas += unidadesVendidas[i] * 10;
            }
        }
        return importeVentas;
    }
}
