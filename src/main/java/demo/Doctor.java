package demo;

public class Doctor {
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    String qualification;
    public Nurse getNurse1() {
        return nurse1;
    }

    public void setNurse1(Nurse nurse1) {
        this.nurse1 = nurse1;
    }

    Nurse nurse1;
    public void assist(){
        nurse1.assist();
        System.out.println("Doctor is assisting");
    }
}
