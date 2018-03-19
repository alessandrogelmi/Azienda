public class Azienda 
{
	Dipendente[] elencoDipendenti;
	private static final int MAX_NUM_DIPENDENTI=15;
	
	//Costruttori
	public Azienda()
	{
		elencoDipendenti=new Dipendente[MAX_NUM_DIPENDENTI];
	}
	
	//getter e setter
	public void setDipendente(Dipendente dipendente)
	{
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if (elencoDipendenti[i]==null)
			{
				elencoDipendenti[i]=dipendente;
				return;
			}	
		}
	}
	
	public Dipendente getDipendente(String nominativo)
	{
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if (elencoDipendenti[i].getNominativo().compareToIgnoreCase(nominativo)==0) 
			{
				return elencoDipendenti[i];
			} 
		}
		return null;
	}
	
	public Dipendente[] dipendentiStipendio(int stipendio)
	{
		Dipendente[] stipendi=new Dipendente[MAX_NUM_DIPENDENTI];
		
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if(elencoDipendenti[i].stipendio()==stipendio)
			{
				for (int j = 0; j < stipendi.length; j++) 
				{
					stipendi[j]=elencoDipendenti[i];
				}
			}
		}
		return stipendi;
	}
	
	public Dipendente stipendioMaggiore()
	{
		Dipendente piuPagato=elencoDipendenti[0];
		
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if (elencoDipendenti[i].stipendio()>piuPagato.stipendio()) 
			{
				piuPagato=elencoDipendenti[i];
			}
		}
		return piuPagato;
	}
	
	public Dipendente piuGiovane()
	{
		Dipendente piuGiovane=elencoDipendenti[0];
		
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if (elencoDipendenti[i].getDataNascita().compareData(piuGiovane.getDataNascita())==-1) 
			{
				piuGiovane=elencoDipendenti[i];
			}
		}
		return piuGiovane;
	}
	
	public String toString()
	{
		String risultato="";
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if (elencoDipendenti[i]!=null)
				risultato+=elencoDipendenti[i].toString()+"\n";
		}
		return risultato;
	}
}
