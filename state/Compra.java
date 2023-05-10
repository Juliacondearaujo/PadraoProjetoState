package padroescomportamentais_exercicios.state;

public class Compra {

    private String nome;
    private CompraEstado estado;

    public Compra() {
        this.estado = CompraEstadoAprovada.getInstance();
    }

    public void setEstado(CompraEstado estado) {
        this.estado = estado;
    }

    public boolean aprovar() {
        return estado.aprovar(this);
    }

    public boolean confirmar() {
        return estado.confirmar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }

    public boolean enviar() {
        return estado.enviar(this);
    }

    public boolean preparar() {
        return estado.preparar(this);
    }


    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CompraEstado getEstado() {
        return estado;
    }
}
