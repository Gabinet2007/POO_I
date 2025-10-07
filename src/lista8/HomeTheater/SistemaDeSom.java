package lista8.HomeTheater;

public class SistemaDeSom extends EquipamentoEletronico {
    private String marca;
    private String modelo;
    private float potencia;

    public SistemaDeSom(float tensao, float consumo, String marca, String modelo, float potencia) {
        super(tensao, consumo);
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sistema de Som - ")
                .append("Marca: ").append(marca)
                .append(" | Modelo: ").append(modelo)
                .append(" | Potência: ").append(potencia).append("W | ")
                .append(super.toString());
        return sb.toString();
    }
}

