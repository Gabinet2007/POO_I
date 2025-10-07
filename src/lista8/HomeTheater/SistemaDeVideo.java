package lista8.HomeTheater;

public class SistemaDeVideo extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private String tipo;
    private String resolucao;

    public SistemaDeVideo(float tensao, float consumo, String marca, String modelo, String tipo, String resolucao) {
        super(tensao, consumo);
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.resolucao = resolucao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sistema de Vídeo - ")
                .append("Marca: ").append(marca)
                .append(" | Modelo: ").append(modelo)
                .append(" | Tipo: ").append(tipo)
                .append(" | Resolução: ").append(resolucao)
                .append(" | ").append(super.toString());
        return sb.toString();
    }
}
