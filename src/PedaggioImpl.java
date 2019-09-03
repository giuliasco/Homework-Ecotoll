

public class PedaggioImpl implements Pedaggio {
	
	public Casello caselloIn;
	public Casello caselloOut;
	public Veicolo veicolo;
	public double IVA=0.22;


	//costruttore 
	
	public PedaggioImpl(Casello caselloIn, Casello caselloOut, Veicolo veicolo) {
		this.caselloIn = caselloIn;
		this.caselloOut = caselloOut;
		this.veicolo = veicolo;
	}

	//metodo che calcola il totale da pagare
	
		@Override
		public double calcolaPedaggio() {
		
		Autostrada a=caselloIn.codiceAutostrada;
		Autostrada b=caselloOut.codiceAutostrada;
		double y=a.getTariffaKm();
		double aggiunta=0;
		
		//mi prendo la classe del veicolo per poi calcolare l'aggiunta per la classe
		char x=veicolo.getClasseveicolo();
		
		switch(x) {
		case 'B':
			aggiunta=0.10;
			break;
		case '3':
			aggiunta=0.30;
			break;
		case '4':
			aggiunta = 0.50;
			break;
		case '5':
			aggiunta=0.70;
			break;
		default :
			aggiunta=0.05; //Per default calcola  l'aggiunta della classe A
		}
		
		
		if(a.equals(b)){
				double e=Math.abs(caselloIn.getAltezzaKm()-caselloOut.getAltezzaKm());
				double tot = e*y;
				float aggIVA= (float) (tot*(IVA)) ;
				double arr=(Math.round((tot + aggIVA)*10)/10)+aggiunta;
				return arr;		
				}
		
		return 0;
		
	}
	
	

}


