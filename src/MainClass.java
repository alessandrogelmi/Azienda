import java.util.Scanner;

public class MainClass 
{
	private static Scanner tastiera;
	
	public static void main(String[] args) 
	{
		int n;
		tastiera = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di dipendenti(5): ");
		n=tastiera.nextInt();
		
		Data data1=new Data(26,11,2000);
		Data data2=new Data(12,2,1997);
		Data data3=new Data(15,12,1930);
		Data data4=new Data(1,1,1931);
		Data data5=new Data(20,6,2002);
	
		Dipendente dipendente1=new Dipendente(1,"Gelmi",data1,2017,2);
		Dipendente dipendente2=new Dipendente(2,"Al Bano",data2,2009,4);
		Dipendente dipendente3=new Dipendente(3,"Pierone",data3,1960,1);
		Dipendente dipendente4=new Dipendente(4,"Ganzo",data4,1950,6);
		Dipendente dipendente5=new Dipendente(5,"Coatto",data5,2017,1);
		Dipendente prova=new Dipendente(0,"prova",data1,2018,1);
	
		Dipendente[] raccolta=new Dipendente[n];
		Dipendente[] dipendenti=new Dipendente[n];
	
		raccolta[0]=dipendente1;
		raccolta[1]=dipendente2;
		raccolta[2]=dipendente3;
		raccolta[3]=dipendente4;
		raccolta[4]=dipendente5;
		
		for (int i = 0; i < dipendenti.length; i++) 
		{
			dipendenti[i]=raccolta[i];
			System.out.println(dipendenti[i].toString());
			if(dipendenti[i].stipendio()>prova.stipendio())
				prova=raccolta[i];
		}	
		
		System.out.println("Dipendente con stipendio maggiore: "+prova.toString());
		
		for (int i = 0; i < raccolta.length; i++) 
		{
			if(raccolta[i].getDataNascita().compareData(prova.getDataNascita())==1)
				prova=raccolta[i];
		}	
		
		System.out.println("Dipendente più anziano: "+prova.toString());
	}
}