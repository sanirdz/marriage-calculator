import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class FeriasCalculator {

    public FeriasCalculator() throws InterruptedException {

        Calendar diaDasFerias = Calendar.getInstance();

        diaDasFerias.clear();
        diaDasFerias.set(Calendar.YEAR, 2016);
        diaDasFerias.set(Calendar.MONTH, Calendar.JANUARY);
        diaDasFerias.set(Calendar.DAY_OF_MONTH, 15);
        diaDasFerias.set(Calendar.HOUR_OF_DAY, 17);
        diaDasFerias.set(Calendar.MINUTE, 0);

        
        SimpleDateFormat sdf = new SimpleDateFormat("'Dia' dd 'de' MMMM 'de' yyyy 'as' HH:mm:SS");
        
        System.out.println(sdf.format(diaDasFerias.getTime()));
        System.out.println("O PAULO vai sair de férias.");

        System.out.println("");
        System.out.println("");
        System.out.println("FFFFFF     '''  RRRRR   III  AAAAAA  SSSSSS  !!!");
        System.out.println("FFFFFF    '''   RR  RR  III  AAAAAA  SSSSSS  !!!");
        System.out.println("FF      EEEEEE  RR  RR       AA  AA  SS      !!!");
        System.out.println("FFFFFF  EE      RRRRR   III  AAAAAA  SSSSSS  !!!");
        System.out.println("FFFFFF  EEEEEE  RR RRR  III  AAAAAA      SS     ");
        System.out.println("FF      EE      RR  RR  III  AA  AA  SSSSSS  !!!");
        System.out.println("FF      EEEEEE  RR  RR  III  AA  AA  SSSSSS  !!!");
        System.out.println("");
        System.out.println("");

        DecimalFormat df = new DecimalFormat("00");

        while (true) {
            Thread.sleep(1000);

            Calendar agora = Calendar.getInstance();

            long milissegundos = diaDasFerias.getTimeInMillis() - agora.getTimeInMillis();
            
            long segundos = milissegundos/1000;
            long minutos = segundos/60;
            long horas = minutos/60;
            long dias = horas/24;

            long horas2 = horas - dias*24; 
            long minutos2 = minutos - horas*60; 
            long segundos2 = segundos - minutos*60; 
            
            System.out.print("\rFaltam " + dias + " dias e " + df.format(horas2) + ":" + df.format(minutos2) + ":" + df.format(segundos2) + " horas\t\t");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new FeriasCalculator();
    }
}
