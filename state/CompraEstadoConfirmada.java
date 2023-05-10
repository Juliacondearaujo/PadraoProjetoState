package padroescomportamentais_exercicios.state;

public class CompraEstadoConfirmada extends CompraEstado{

    private CompraEstadoConfirmada() {};
    private static CompraEstadoConfirmada instance = new CompraEstadoConfirmada();
    public static CompraEstadoConfirmada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Confirmada";
    }

    public boolean aprovar(Compra compra) {
        compra.setEstado(CompraEstadoAprovada.getInstance());
        return true;
    }
}
