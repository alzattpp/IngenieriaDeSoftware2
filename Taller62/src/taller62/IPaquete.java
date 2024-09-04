package taller62;

public interface IPaquete {
    void calcularCostoEnvioPequeno();
    void calcularCostoEnvioGrande();
    void verificarContenidoPeligroso();
    void asegurarPaquetePeligroso(boolean embalajeEspecial);
}
