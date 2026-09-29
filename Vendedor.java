public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    @Override
    public void mostrarDetalle() {
        double comision = estrategia.calcularComision(ventasMes);

        System.out.println("Nombre: " + nombre);
        System.out.println("Ventas del mes: " + ventasMes);
        System.out.println("Comision: " + comision);
    }

}
