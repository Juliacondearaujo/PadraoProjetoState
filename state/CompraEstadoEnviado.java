package padroescomportamentais_exercicios.state;

public class CompraEstadoEnviado extends CompraEstado{


    private CompraEstadoEnviado() {};
    private static CompraEstadoEnviado instance = new CompraEstadoEnviado();
    public static CompraEstado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

    public boolean entregar(Compra compra) {
        compra.setEstado(CompraEstadoEntregue.getInstance());
        return true;
    }
}
