public class Data 
{
	//variabili
	
	private int giorno;
	private int mese;
	private int anno;
	
	//costruttori
	
	public Data (int giorno, int mese, int anno)
	{
		setGiorno(giorno);
		setMese(mese);
		setAnno(anno);
	}
	
	public Data (Data data)
	{
		setGiorno(data.getGiorno());
		setMese(data.getMese());
		setAnno(data.getAnno());		
	}
	
	//getter e setter

	public int getGiorno() 
	{
		return giorno;
	}

	public void setGiorno(int giorno) 
	{
		if(giorno>=1 && giorno<=31)
			this.giorno = giorno;
		else
			this.giorno=1;
	}

	public int getMese() 
	{
		return mese;
	}

	public void setMese(int mese) 
	{
		if(mese>=1 && mese<=12)
			this.mese = mese;
		else
			this.mese=1;
	}

	public int getAnno() 
	{
		return anno;
	}

	public void setAnno(int anno) 
	{
		if(anno>=1900 && anno<=2500)
			this.anno = anno;
		else
			this.anno=1900;
	}
	
	//metodi 
	
	public String toString()
	{
		return (getGiorno()+"/"+getMese()+"/"+getAnno());
	}
	
	public int compareData(Data data)
	{
		int data1 = ((this.getAnno() * 100) + this.getMese()) * 100 + this.getGiorno();
		int data2 = ((data.getAnno() * 100) + data.getMese()) * 100 + data.getGiorno();
		
		if (data1 > data2) 
			return -1;
		
		else if (data1 == data2) 
			return 0;
		
		else
			return +1;
	}
}