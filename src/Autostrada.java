
import java.util.TreeSet;

public class Autostrada {


	private double km,tariffa_km;
	private String nome_autostrada,inizio,fine;
	TreeSet<Casello> listaCaselli ;
	
	
	//metodi get e set
	
	
	
	public double getKm() {return km;}
	public void setKm(double km) {this.km=km;}
	
	public double getTariffaKm() {return tariffa_km;}
	public void setTariffaKm(double tariffa_km) {this.tariffa_km=tariffa_km;}
	
	public String getNomeAutostrada() {return nome_autostrada;}
	public void setNomeAutostrada(String nome_autostrada) {this.nome_autostrada=nome_autostrada;}
	
	public String getInizio() {return inizio;}
	public void setInizio(String inizio) {this.inizio=inizio;}
	
	public String getFine() {return fine;}
	public void setFine(String fine) {this.fine=fine;}
	
	
	
	
	public TreeSet<Casello> getCaselliList() {return listaCaselli;}
	public void setCaselliList(TreeSet<Casello> caselliList) {this.listaCaselli = caselliList;}
	
	
	//costruttore
	 
public Autostrada() {}
	
	
	//costruttore che contiene tutti i campi
	public Autostrada( double km,double tariffa_km,String nome_autostrada, String inizio,String fine,TreeSet<Casello> caselliList) {
		
		this.km= km;
		this.tariffa_km= tariffa_km;
		this.nome_autostrada= nome_autostrada;
		this.inizio= inizio;
		this.fine= fine;
		this.listaCaselli= new TreeSet<Casello>();
	}
	
	
	
	
	
	//metodo toString
	
	@Override
	public String toString() {
		return this.nome_autostrada;
	}

	public boolean addCasello(Autostrada autostrada, String nome, float km) {
		Casello casello = new Casello (autostrada, nome, km);
		 return listaCaselli.add(casello);	
	}
	
	
	public boolean addCasello(Casello c) {
		return listaCaselli.add(c);	
	}
}