package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.neuroServices();
		
		fh.medicalReasearch();
		fh.publishMedicalNews();
		
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		
		USMedical.medicalTraining();
		FortisHospital.medicalTraining();
		
		
		//top casting:
		//child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		
		us.pediaServices();
		us.emergencyServices();
		us.OrthoServices();
		us.physioServices();
		
		//
		//FortisHospital fh1 = new USMedical();
		
		
		
			
		
		
	}

}
