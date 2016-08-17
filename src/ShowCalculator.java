import java.text.DecimalFormat;
import java.util.Calendar;


public class ShowCalculator {

	public ShowCalculator() throws InterruptedException {

		Calendar diaDaMorte = Calendar.getInstance();

		diaDaMorte.clear();
		diaDaMorte.set(Calendar.YEAR, 2014);
		diaDaMorte.set(Calendar.MONTH, Calendar.SEPTEMBER);
		diaDaMorte.set(Calendar.DAY_OF_MONTH, 13);
		diaDaMorte.set(Calendar.HOUR_OF_DAY, 20);
		diaDaMorte.set(Calendar.MINUTE, 00);
		
		System.out.println("Dia 13 de setembro de 2014 20:00:00");
		System.out.println("Dia que eu vou no show com o meu amigao Julho.");
		System.out.println("Juleba.");

		System.out.println("");
		System.out.println("");
		System.out.println("SSSSSS HH  HH  OOOO  WW    WW !!!");
		System.out.println("SSSSSS HH  HH OO  OO WW    WW !!!");
		System.out.println("SS     HHHHHH OO  OO WW    WW !!!");
		System.out.println("SSSSSS HHHHHH OO  OO WW WW WW !!!");
		System.out.println("    SS HHHHHH OO  OO WW WW WW    ");
		System.out.println("SSSSSS HH  HH OO  OO WW WW WW !!!");
		System.out.println("SSSSSS HH  HH  OOOO  WWWWWWWW !!!");
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
		new ShowCalculator();
	}
}
