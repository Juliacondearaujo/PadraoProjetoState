package padroescomportamentais_exercicios.state;

public class CompraEstadoEntregue extends CompraEstado{

    private CompraEstadoEntregue() {};
    private static CompraEstadoEntregue instance = new CompraEstadoEntregue();
    public static CompraEstadoEntregue getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Entregue";
    }

}
