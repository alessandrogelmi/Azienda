import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dipendente 
{
	//Variabili
	
	private int matricola;
	private String nominativo;
	private Data dataNascita;
	private int annoAssunzione;
	private int livelloRetribuzione;
	static int contributoAnzianita=50;
	static int contributoLivello=25;
	
	final static int base=800;
	
	//costruttori
	
	public Dipendente(int matricola, String nominativo, Data dataNascita, int annoAssunzione, int livelloRetributivo)
	{
		setMatricola(matricola);
		setNominativo(nominativo);
		setDataNascita(dataNascita);
		setAnnoAssunzione(annoAssunzione);
		setLivelloRetribuzione(livelloRetributivo);
	}
	
	public Dipendente(Dipendente dipendente)
	{
		setMatricola(dipendente.getMatricola());
		setNominativo(dipendente.getNominativo());
		setDataNascita(dipendente.getDataNascita());
		setAnnoAssunzione(dipendente.getAnnoAssunzione());
		setLivelloRetribuzione(dipendente.getLivelloRetribuzione());
	}
	
	//getter e setter
	
	public int getMatricola() 
	{
		return matricola;
	}
	public void setMatricola(int matricola) 
	{
		this.matricola = matricola;
	}
	public String getNominativo() 
	{
		return nominativo;
	}
	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}
	public Data getDataNascita() 
	{
		return dataNascita;
	}
	public void setDataNascita(Data dataNascita) 
	{
		this.dataNascita=new Data(dataNascita);
	}
	public int getAnnoAssunzione() 
	{
		return annoAssunzione;
	}
	public void setAnnoAssunzione(int annoAssunzione)
	{
		this.annoAssunzione = annoAssunzione;
	}
	public int getLivelloRetribuzione()
	{
		return livelloRetribuzione;
	}
	public void setLivelloRetribuzione(int livelloRetribuzione) 
	{
		if(livelloRetribuzione>=1 && livelloRetribuzione<=6)
			this.livelloRetribuzione = livelloRetribuzione;
		else if(livelloRetribuzione>6)
			this.livelloRetribuzione = 6;
		else
			this.livelloRetribuzione = 1;
	}
	public static int getContributoAnzianita() 
	{
		return contributoAnzianita;
	}
	public static void setContributoAnzianita(int contributoAnzianita)
	{
		Dipendente.contributoAnzianita = contributoAnzianita;
	}
	public static int getContributoLivello() 
	{
		return contributoLivello;
	}
	public static void setContributoLivello(int contributoLivello) 
	{
		Dipendente.contributoLivello = contributoLivello;
	}
	
	//metodi
	
	public String toString()
	{
		return(getMatricola()+" - "+getNominativo()+" - "+getDataNascita()+" - Assunzione: "+getAnnoAssunzione()+" - Livello: "+getLivelloRetribuzione()+" - Stipendio: "+stipendio());
	}
	
	public int stipendio()
	{
		int stipendio = 0;
		int anzianita;
		
		GregorianCalendar gc =new GregorianCalendar();
		int anno=gc.get(Calendar.YEAR);
		
		anzianita=anno-getAnnoAssunzione();
		
		stipendio=base+(anzianita*50)+(25*livelloRetribuzione);
		
		return stipendio;
	}
}