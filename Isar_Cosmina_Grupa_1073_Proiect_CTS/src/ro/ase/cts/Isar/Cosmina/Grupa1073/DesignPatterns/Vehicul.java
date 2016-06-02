package ro.ase.cts.Isar.Cosmina.Grupa1073.DesignPatterns;

public class Vehicul {
	
	private String marca;
	private String model;
	private float pret;
	private int putere;
	private int capacitateCilindrica;
	private String tipCombustibil;
	private String culoare;
	
	private Vehicul() {
	}

	public String getMarca() {
		return marca;
	}

	public String getModel() {
		return model;
	}

	public float getPret() {
		return pret;
	}

	public int getPutere() {
		return putere;
	}

	public int getCapacitateCilindrica() {
		return capacitateCilindrica;
	}

	public String getTipCombustibil() {
		return tipCombustibil;
	}

	public String getCuloare() {
		return culoare;
	}
	
	public static class VehiculBuilder {
		
		private Vehicul vehicul;
		
		public VehiculBuilder(String marca, String model) {
			this.vehicul = new Vehicul();
			this.vehicul.marca = marca;
			this.vehicul.model = model;
		}
		
		public VehiculBuilder adaugaPret(float pret) {
			this.vehicul.pret = pret;
			return this;
		}
		
		public VehiculBuilder adaugaPutere(int putere) {
			this.vehicul.putere = putere;
			return this;
		}
		
		public VehiculBuilder adaugaCapacitateCilindrica(int capacitateCilindrica) {
			this.vehicul.capacitateCilindrica = capacitateCilindrica;
			return this;
		}
		
		public VehiculBuilder adaugaTipCombustibil(String tipCombustibil) {
			this.vehicul.tipCombustibil = tipCombustibil;
			return this;
		}
		
		public VehiculBuilder adaugaCuloare(String culoare) {
			this.vehicul.culoare = culoare;
			return this;
		}
		
		public Vehicul build() {
			return this.vehicul;
		}
		
		public String afiseazaInfoConstructor() {
			return "Marca: " + this.vehicul.marca + ", Model: " + this.vehicul.model;
		}
		
	}
	
}
