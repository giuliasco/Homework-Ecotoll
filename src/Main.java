public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aggiunta veicoli
	     Veicolo v1 = new Veicolo("DV201TB",(float) 1.20,2, 'A');
	     Veicolo v2 = new Veicolo("EH182HG", (float) 1.90,2,'B');
	     Veicolo v3 = new Veicolo("EK955VH", (float) 1.70, 2, '3');
	     
	     
	     
	     //Autostrade
	     Autostrada a1 = new Autostrada((float) 158.3, 0.17,"A24-Autostrada dei parchi","Teramo","Roma", null);
	     Autostrada a2 = new Autostrada((float) 760,(float)0.09,"A1-Autostrada del Sole","Milano","Napoli", null);
	     Autostrada a3= new Autostrada((float) 114,0.17 ,"A25- Autostrada dei parchi","Torano","Pescara",null );
	     
	     //Aggiunta dei caselli nell'autostrada corrispondente
	     a1.addCasello(a1, "Lunghezza",(float)8); 
	     a1.addCasello(a1, "Carsoli-oricola", (float)50.5);
	     
	     
	     //Aggiungo prima i caselli poi li aggiungo nella lista dei caselli in Autostrada
	     Casello c4 = new Casello(a3,"Avezzano",(float)87.1);
	     a2.addCasello(c4);
	     Casello c3 = new Casello(a3,"Bussi-popoli",(float)149.9);
	     a2.addCasello(c3);
	     Casello c5 = new Casello(a2,"Lodi",(float)24);
	     a1.addCasello(c5);
	     Casello c6 = new Casello(a2,"Fiorenzuola",(float)75);
	     a1.addCasello(c6); 
	     Casello c7 = new Casello(a1,"L'Aquila Est",(float)106.7);
	     a1.addCasello(c7);
	     Casello c8 = new Casello(a1,"L'Aquila Ovest",(float)101.2);
	     a1.addCasello(c8);
	     
	     
	     //Pedaggio da veicoli v1,v2,v4
		 Pedaggio p1 = new PedaggioImpl(c7,c8,v1);
	     Pedaggio p2 = new PedaggioImpl(c6,c5,v2);
	     Pedaggio p3 = new PedaggioImpl(c4,c3,v3);
	     
	     
	     System.out.println(p1.calcolaPedaggio() + " € calcolo primo pedaggio");
	     System.out.println(p2.calcolaPedaggio() + " € calcolo secondo pedaggio");
	     System.out.println(p3.calcolaPedaggio() + " € calcolo terzo pedaggio");
	}

}
