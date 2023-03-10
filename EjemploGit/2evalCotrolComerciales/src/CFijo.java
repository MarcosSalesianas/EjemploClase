public class CFijo extends Comercial {
    private int sueldoFijo;

    public CFijo(String nombre, int sueldoFijo) {
        super(nombre);
        this.sueldoFijo = sueldoFijo;
        this.ganancias = calcularVentas();
    }

    @Override
    public double calcularVentas() {
        double importeVentas=0;
        for (int i=0; i<unidadesVendidas.length; i++) {
            importeVentas += unidadesVendidas[i] * 5;
        }
        return importeVentas;
    }

    public double subirImporte(double porcentaje) {
        double sueldoAumentado = ((porcentaje * sueldoFijo) / 100 );
        return sueldoAumentado;
    }
}
