package adapter;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Info info = new Info();
        info.setDataDiNascita(new GregorianCalendar(1995, GregorianCalendar.JULY, 22).getTime());
        info.setNome("Mario");
        info.setCognome("Rossi");

        UserData userData = new UserData();
        Adapter adapter = new Adapter(info);
        userData.getData(adapter);

        System.out.println("Nome completo: " + userData.getNomeCompleto());
        System.out.println("Età" + userData.getEta());
    }
}
