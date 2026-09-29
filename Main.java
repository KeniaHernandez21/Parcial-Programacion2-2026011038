public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia = new ComisionEstandar(); // Estrategia Inicial -  Causar conflicto con comentario.

        Vendedor vendedor = new Vendedor(
                "Kenia",
                1000,
                estrategia
        );

        vendedor.mostrarDetalle();
    }

}