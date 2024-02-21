package adapter;

import java.time.LocalDate;
import java.util.Date;

public class Adapter implements DataSource{
    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataDiNascita = info.getDataDiNascita();
        Date oggi = new Date(System.currentTimeMillis());
        long diffMill = Math.abs(oggi.getTime()-dataDiNascita.getTime());
        long diffDate = diffMill/(24 * 60 * 60 * 1000);
        return (int) diffDate/365;

    }
}
