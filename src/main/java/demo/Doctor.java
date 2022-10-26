package demo;

public class Doctor {
    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    String qualification;

    public void assist(){

        System.out.println("Doctor is assisting");
    }
}
