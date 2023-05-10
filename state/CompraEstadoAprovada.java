package padroescomportamentais_exercicios.state;

public class CompraEstadoAprovada extends CompraEstado{

    private CompraEstadoAprovada() {};
    private static CompraEstadoAprovada instance = new CompraEstadoAprovada();
    public static CompraEstadoAprovada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aprovada";
    }

    public boolean preparar(Compra compra) {
        compra.setEstado(CompraEstadoPrepararando.getInstance());
        return true;
    }
}
