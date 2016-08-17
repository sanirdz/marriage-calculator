import java.text.DecimalFormat;
import java.util.Calendar;


public class DiaDaMorteCalculator {

	public DiaDaMorteCalculator() throws InterruptedException {

		Calendar diaDaMorte = Calendar.getInstance();

		diaDaMorte.clear();
		diaDaMorte.set(Calendar.YEAR, 2014);
		diaDaMorte.set(Calendar.MONTH, Calendar.SEPTEMBER);
		diaDaMorte.set(Calendar.DAY_OF_MONTH, 6);
		diaDaMorte.set(Calendar.HOUR_OF_DAY, 20);
		diaDaMorte.set(Calendar.MINUTE, 00);
		
		System.out.println("Dia 6 de setembro de 2014 20:00:00");
		System.out.println("Dia que o RAMON vai casar.");
		System.out.println("CASAR.");

		System.out.println("");
		System.out.println("");
		System.out.println("CCCCCC AAAAAA SSSSSS AAAAAA RRRRR  !!!");
		System.out.println("CCCCCC AAAAAA SSSSSS AAAAAA RR  RR !!!");
		System.out.println("CC     AA  AA SS     AA  AA RR  RR !!!");
		System.out.println("CC     AAAAAA SSSSSS AAAAAA RRRRR  !!!");
		System.out.println("CC     AAAAAA     SS AAAAAA RR RRR    ");
		System.out.println("CCCCCC AA  AA SSSSSS AA  AA RR  RR !!!");
		System.out.println("CCCCCC AA  AA SSSSSS AA  AA RR  RR !!!");
		System.out.println("");
		System.out.println("");
		
		
        DecimalFormat df = new DecimalFormat("00");
        
        while (true) {
            Thread.sleep(1000);

            Calendar agora = Calendar.getInstance();

            long milissegundos = diaDaMorte.getTimeInMillis() - agora.getTimeInMillis();
            
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
		new DiaDaMorteCalculator();
	}
}
