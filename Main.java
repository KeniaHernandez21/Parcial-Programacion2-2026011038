public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia = new ComisionEstandar();

        Vendedor vendedor = new Vendedor(
                "Kenia",
                1000,
                estrategia
        );

        vendedor.mostrarDetalle();
    }

}