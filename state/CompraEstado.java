package padroescomportamentais_exercicios.state;


public abstract class CompraEstado {

    public abstract String getEstado();

    public boolean aprovar(Compra compra) {
        return false;
    }

    public boolean confirmar(Compra compra) {
        return false;
    }

    public boolean entregar(Compra compra) {
        return false;
    }

    public boolean enviar(Compra compra) {
        return false;
    }

    public boolean preparar(Compra compra) {
        return false;
    }

}
