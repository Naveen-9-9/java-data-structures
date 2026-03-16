class Hospital{
    String HospitalName;

    void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }
    void displayHospitalName(){
        System.out.println("Hospital Name : " + HospitalName );
    }

}

class Doctor extends Hospital{
    String DoctorName;
    String specialization;
    
    public void setDoctorDetails(String DoctorName, String specialization){
        this.DoctorName=DoctorName;
        this.specialization=specialization;
    }
    
    void displayDoctorDetails() {
        System.out.println("Doctor Name : " + DoctorName );
        System.out.println("Specialization :"+specialization);
    }
}
class Patient extends Hospital{
    String patientName;
    String disease;

    void setPatientDetails(String patientName, String disease) {
        this.patientName=patientName;
        this.disease=disease;
    }
    void displayPatientDetails() {
        System.out.println("Patient  Name : " + patientName );
        System.out.println("Disease: " + disease );

    }
}

public class Problem3 {
    public static void main(String[] args) {
        Patient Pt = new Patient();
        Doctor dc = new Doctor();

        Pt.setHospitalName("City Care Hospital ");
        dc.setDoctorDetails("Dr. Meena ","Cardiology");
        Pt.setPatientDetails("Bunny","Letter Problem");

        Pt.displayHospitalName();
        dc.displayDoctorDetails();
        Pt.displayPatientDetails();
    }
    
}
