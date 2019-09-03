public class Veicolo {
	
	
	public String targa;
	public float altezza;
	public int n_assi;
	public char classe_veicolo;
	
	

	
	//metodi get e set

	public int getNAssi() {return n_assi;}
	public void setNAssi(int n_assi) {this.n_assi = n_assi;}
	
	public char getClasseveicolo() {return classe_veicolo;}
	public void setClasseveicolo(char classe_veicolo) {this.classe_veicolo = classe_veicolo;}
	
	public String getTarga() {return targa;}
	public void setTarga(String targa) {this.targa = targa;}
	
	
	public float getAltezza() {return altezza;}
	public void setAltezza(float altezza) {this.altezza = altezza;}
	
	
	//costruttore
	
	public Veicolo(String targa, float altezza, int n_assi,char classe_veicolo) {
		
		this.targa = targa;
		this.altezza = altezza;
		this.n_assi = n_assi;
		this.classe_veicolo = classe_veicolo;
	}
	
	
	//metodo toString
	
	@Override
	public String toString() {
		return "Veicolo [targa=" + targa + ",altezza=" + altezza + ", numero assi=" + n_assi + ", classeveicolo=" + classe_veicolo + "]";
	}
	
	

}