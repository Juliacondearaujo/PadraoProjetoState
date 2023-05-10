package padroescomportamentais_exercicios.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padroescomportamentais.state.*;

import static org.junit.jupiter.api.Assertions.*;

public class CompraTest {

    Compra compra;

    @BeforeEach
    public void setUp() {
        compra = new Compra();
    }


    @Test
    public void naoDeveConfirmarCompraConfirmada() {
        compra.setEstado(CompraEstadoConfirmada.getInstance());
        assertFalse(compra.confirmar());
    }

    @Test
    public void naoDevePrepararCompraPreparando() {
        compra.setEstado(CompraEstadoPrepararando.getInstance());
        assertFalse(compra.preparar());
    }

    @Test
    public void naoDeveAprovarCompraAprovando() {
        compra.setEstado(CompraEstadoAprovada.getInstance());
        assertFalse(compra.aprovar());
    }

    @Test
    public void naoDeveEnviarCompraEnviando() {
        compra.setEstado(CompraEstadoEnviado.getInstance());
        assertFalse(compra.enviar());
    }

    @Test
    public void naoDeveEntregarCompraEntregue() {
        compra.setEstado(CompraEstadoEntregue.getInstance());
        assertFalse(compra.entregar());
    }

    @Test
    public void naoDeveConfirmarCompraAprovada() {
        compra.setEstado(CompraEstadoAprovada.getInstance());
        assertFalse(compra.confirmar());
    }
    @Test
    public void naoDeveConfirmarCompraEntregue() {
        compra.setEstado(CompraEstadoEntregue.getInstance());
        assertFalse(compra.confirmar());
    }

    @Test
    public void naoDeveConfirmarCompraEnviado() {
        compra.setEstado(CompraEstadoEnviado.getInstance());
        assertFalse(compra.confirmar());
    }

    @Test
    public void naoDeveConfirmarCompraPreparando() {
        compra.setEstado(CompraEstadoPrepararando.getInstance());
        assertFalse(compra.confirmar());
    }

    @Test
    public void naoDeveAprovarCompraEntregue() {
        compra.setEstado(CompraEstadoEntregue.getInstance());
        assertFalse(compra.aprovar());
    }
    @Test
    public void naoDeveAprovarCompraEnviada() {
        compra.setEstado(CompraEstadoEnviado.getInstance());
        assertFalse(compra.aprovar());
    }

    @Test
    public void naoDeveAprovarCompraPreparando() {
        compra.setEstado(CompraEstadoPrepararando.getInstance());
        assertFalse(compra.aprovar());
    }

    @Test
    public void naoDeveEntregarCompraAprovando() {
        compra.setEstado(CompraEstadoAprovada.getInstance());
        assertFalse(compra.entregar());
    }

    @Test
    public void naoDeveEntregarCompraConfirmada() {
        compra.setEstado(CompraEstadoConfirmada.getInstance());
        assertFalse(compra.entregar());
    }

    @Test
    public void naoDeveEntregarCompraPrepatando() {
        compra.setEstado(CompraEstadoPrepararando.getInstance());
        assertFalse(compra.entregar());
    }

    @Test
    public void naoDeveEnviarCompraEntregue() {
        compra.setEstado(CompraEstadoEntregue.getInstance());
        assertFalse(compra.enviar());
    }

    @Test
    public void naoDeveEnviarCompraConfirmada() {
        compra.setEstado(CompraEstadoConfirmada.getInstance());
        assertFalse(compra.enviar());
    }

    @Test
    public void naoDeveEnviarCompraAprovando() {
        compra.setEstado(CompraEstadoAprovada.getInstance());
        assertFalse(compra.enviar());
    }

    @Test
    public void naoDevePrepararCompraConfirmada() {
        compra.setEstado(CompraEstadoConfirmada.getInstance());
        assertFalse(compra.preparar());
    }

    @Test
    public void naoDevePrepararCompraEntregue() {
        compra.setEstado(CompraEstadoEntregue.getInstance());
        assertFalse(compra.preparar());
    }

    @Test
    public void naoDevePrepararCompraEnviada() {
        compra.setEstado(CompraEstadoEnviado.getInstance());
        assertFalse(compra.preparar());
    }
    @Test
    public void deveAprovarCompraConfirmada() {
        compra.setEstado(CompraEstadoConfirmada.getInstance());
        assertTrue(compra.aprovar());
        assertEquals(CompraEstadoAprovada.getInstance(), compra.getEstado());
    }

    @Test
    public void devePrepararCompraAprovada() {
        compra.setEstado(CompraEstadoAprovada.getInstance());
        assertTrue(compra.preparar());
        assertEquals(CompraEstadoPrepararando.getInstance(), compra.getEstado());
    }

    @Test
    public void deveEnviarCompraPreparada() {
        compra.setEstado(CompraEstadoPrepararando.getInstance());
        assertTrue(compra.enviar());
        assertEquals(CompraEstadoEnviado.getInstance(), compra.getEstado());
    }

    @Test
    public void deveEntregarCompraEnviada() {
        compra.setEstado(CompraEstadoEnviado.getInstance());
        assertTrue(compra.entregar());
        assertEquals(CompraEstadoEntregue.getInstance(), compra.getEstado());
    }



}