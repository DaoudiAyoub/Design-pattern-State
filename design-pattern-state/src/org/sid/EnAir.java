package org.sid;

public class EnAir extends Etat {

	public EnAir(Avion avion) {
		super(avion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entrerAuGarage() {
		// TODO Auto-generated method stub
		System.out.println("Error--Impossible");
	}

	@Override
	public void sortirDuGarage() {
		// TODO Auto-generated method stub
		System.out.println("Error--Impossible");
	}

	@Override
	public void decoller() {
		// TODO Auto-generated method stub
		System.out.println("Error--Vous etes déja En Air");
	}

	@Override
	public void atterir() {
		// TODO Auto-generated method stub
		System.out.println("Transition d'état Air ====> Piste");
		avion.setEtat(new EnPiste(avion));
		
	}

	@Override
	public void doActivity() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
		System.out.println("Vous etes En Air");
		}
	}

}
