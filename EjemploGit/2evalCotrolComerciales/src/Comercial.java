public abstract class Comercial {

    private String nombre;
    protected double ganancias;
    private double gananciasPagadas;
    protected int[] unidadesVendidas;
    protected static String marcas[] = {"Nike", "Adidas", "Converse"};
   
    public Comercial(String nombre) {
        this.nombre = nombre;
        this.unidadesVendidas=new int[marcas.length];
    }

    public abstract double calcularVentas();

    public String getNombre() {
        return nombre;
    }

    public void setUnidadesVendidas(int numVentas, int numMarca) {
        this.unidadesVendidas[numMarca] += numVentas;
    }
    
    public int getUnidadesVendidas(int numMarca){
        return unidadesVendidas[numMarca];
    }

    public static int buscarMarca(String marca) {
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i].equalsIgnoreCase(marca)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        String aux = "Comercial{" + "nombre=" + nombre + ", unidadesVendidas=";
        for (int i = 0; i < marcas.length; i++) {
            aux += "\t"+unidadesVendidas[i];
        }
        return aux;
    }

}