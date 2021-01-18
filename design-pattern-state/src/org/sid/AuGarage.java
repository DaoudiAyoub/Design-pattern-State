package org.sid;

public class AuGarage extends Etat {

	public AuGarage(Avion avion) {
		super(avion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entrerAuGarage() {
		// TODO Auto-generated method stub
		System.out.println("Error--Vous etes déja Au Garage");
		
	}

	@Override
	public void sortirDuGarage() {
		// TODO Auto-generated method stub
		System.out.println("Transition d'état Garage ====> Piste");
		avion.setEtat(new EnPiste(avion));
		
	}

	@Override
	public void decoller() {
		// TODO Auto-generated method stub
		System.out.println("Error--Impossible");
		
	}

	@Override
	public void atterir() {
		// TODO Auto-generated method stub
		System.out.println("Error--Impossible");
		
	}

	@Override
	public void doActivity() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
		System.out.println("Vous etes Au Garage");
		}
		
	}

}
