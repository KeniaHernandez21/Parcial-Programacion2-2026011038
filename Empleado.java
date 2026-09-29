public abstract class Empleado {

    protected String nombre;
    protected double ventasMes;
    protected EstrategiaComision estrategia;

    public void cambiarEstrategia(EstrategiaComision nueva) {
        this.estrategia = nueva;
    }

    public abstract void mostrarDetalle();

}
