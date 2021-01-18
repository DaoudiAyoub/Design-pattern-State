package org.sid;

public class EnPiste extends Etat {

	public EnPiste(Avion avion) {
		super(avion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void entrerAuGarage() {
		// TODO Auto-generated method stub
		System.out.println("Transition d'état Piste ====> Garage");
		avion.setEtat(new AuGarage(avion));
		
	}

	@Override
	public void sortirDuGarage() {
		// TODO Auto-generated method stub
		System.out.println("Error--Vous etes déja sur Piste");
		
	}

	@Override
	public void decoller() {
		// TODO Auto-generated method stub
		System.out.println("Transition d'état Piste ====> Air");
		avion.setEtat(new EnAir(avion));
		
		
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
		System.out.println("Vous etes sur Piste");
		}
	}

}
