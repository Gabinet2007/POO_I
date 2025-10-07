package lista8.Computador;

public class EquipamentoEletronico {
    private float tensao;
    private float consumo;

    public EquipamentoEletronico(float tensao, float consumo) {
        this.tensao = tensao;
        this.consumo = consumo;
    }

    public float getTensao() {
        return tensao;
    }

    public float getConsumo() {
        return consumo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipamento Eletrônico - Tensão: ").append(tensao)
                .append("V | Consumo: ").append(consumo).append("W");
        return sb.toString();
    }
}

