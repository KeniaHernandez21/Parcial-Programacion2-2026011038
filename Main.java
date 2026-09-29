public class Main {

    public static void main(String[] args) {

        EstrategiaComision estrategia = new ComisionPersonalizada();

        Vendedor vendedor = new Vendedor(
                "Kenia",
                1000,
                estrategia
        );

        vendedor.mostrarDetalle();
    }

}