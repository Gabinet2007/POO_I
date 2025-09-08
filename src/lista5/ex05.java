package lista5;

public class ex05 {
    private int codigo;
    private int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double precoUnitario() {
        switch (codigo) {
            case 100: return 1.20;
            case 101: return 1.30;
            case 102: return 1.50;
            case 103: return 1.20;
            case 104: return 1.30;
            case 105: return 1.00;
            default: return 0.0;
        }
    }

    public double valorItem() {
        return precoUnitario() * quantidade;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Código ");
        builder.append(codigo);
        builder.append(" | Quantidade: ");
        builder.append(quantidade);
        builder.append(" | Valor: R$ ");
        builder.append(valorItem());
        return builder.toString();
    }
}
