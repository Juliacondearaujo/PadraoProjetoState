package padroescomportamentais_exercicios.state;

public class CompraEstadoPrepararando extends CompraEstado{

    private CompraEstadoPrepararando() {};
    private static CompraEstadoPrepararando instance = new CompraEstadoPrepararando();
    public static CompraEstadoPrepararando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Preparando";
    }

    public boolean enviar(Compra compra) {
        compra.setEstado(CompraEstadoEnviado.getInstance());
        return true;
    }
}
