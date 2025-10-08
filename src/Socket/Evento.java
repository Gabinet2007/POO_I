package Socket;

import java.time.Instant;
import java.time.LocalDateTime;

public class Evento {

    private String descricao;
    private String local;
    private Instant data;
    private LocalDateTime createdat;

    public Evento(String descricao, String local, Instant data) {
        setDescricao(descricao);
        setLocal(local);
        setData(data);
        setCreatedat();
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public Instant getData() {
        return data;
    }
    public void setData(Instant data) {
        this.data = data;
    }
    public LocalDateTime getCreatedat() {
        return createdat;
    }
    public void setCreatedat() {
        this.createdat = LocalDateTime.now();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Evento [descricao=");
        builder.append(descricao);
        builder.append(", local=");
        builder.append(local);
        builder.append(", data=");
        builder.append(data);
        builder.append(", createdat=");
        builder.append(createdat);
        builder.append("]");
        return builder.toString();
    }
}