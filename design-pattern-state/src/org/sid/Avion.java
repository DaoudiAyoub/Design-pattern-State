package org.sid;

public class Avion implements IAvion {
	
	private Etat etat;
	
	public Avion() {
		this.etat=new EnPiste(this);
	}

	@Override
	public void entrerAuGarage() {
		// TODO Auto-generated method stub
		etat.entrerAuGarage();
		
	}

	@Override
	public void sortirDuGarage() {
		// TODO Auto-generated method stub
		etat.sortirDuGarage();
	}

	@Override
	public void decoller() {
		// TODO Auto-generated method stub
		etat.decoller();
		
	}

	@Override
	public void atterir() {
		// TODO Auto-generated method stub
		etat.atterir();
	}

	@Override
	public void doActivity() {
		// TODO Auto-generated method stub
		etat.doActivity();
	}


	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	
	

}
