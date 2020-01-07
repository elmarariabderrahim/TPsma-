package webService;

import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;



public class ServicePublier {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EtudiantService S=new EtudiantService();
		
		Etudiant E1=new Etudiant();
		E1.setN1(10.5);
		E1.setN2(19.5);
		E1.setNom("ihsane");
		E1.setPrenom("Jaafer");
	
		Etudiant E2=new Etudiant();
		E2.setN1(10);
		E2.setN2(10.5);
		E2.setNom("Naciri");
		E2.setPrenom("achraf");
		
		Etudiant E3=new Etudiant();
		E3.setN1(0.5);
		E3.setN2(11.5);
		E3.setNom("El marari");
		E3.setPrenom("abderrahim");
		
		S.AjouterEtud(E1);
		S.AjouterEtud(E2);
		S.AjouterEtud(E3);
		
		for ( Etudiant i:S.getValidant())
		{
			System.out.println("Les etudiants Validants \n" +i.getNom()+"\n");

		}
		
		
		System.out.println("L etudiant Majorant : "+S.getMajorant().getNom()+"\n");
		
		
		System.out.println(S.getNote("ihsane"));
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*Leibniz L=new Leibniz();
			System.out.println(L.getApprox(1000000000))	;
			}*/
		
		Endpoint endpoint=Endpoint.publish("http://localhost:8080/Gestion",new EtudiantService());
		JOptionPane.showMessageDialog(null, "Eteindre le serveur");
		
		endpoint.stop();
		
	}

}
