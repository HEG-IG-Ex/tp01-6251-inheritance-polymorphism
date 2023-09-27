package modele;

public class Student extends Person{
    private String courseSession;
    private String workDay;

    public Student(String prenom, String nom, String courseSession) {
        super(prenom, nom);
        this.courseSession = courseSession;
        this.workDay = null;
    }

    public Student(String prenom, String nom, String courseSession, String workDay) {
        super(prenom, nom);
        this.courseSession = courseSession;
        this.workDay = workDay;
    }


    public String getCourseSession() {
        return courseSession;
    }

    public void setCourseSession(String courseSession) {
        this.courseSession = courseSession;
    }

    public String getWorkDay() {
        return workDay;
    }

    public void setWorkDay(String workDay) {
        this.workDay = workDay;
    }

    public boolean isPartTime(){
        return workDay != null;
    }

    @Override
    public String toString() {
        return super.toString()+", suis étudiant(e) "
                + (isPartTime() ? "à temps plein" : "à temps partiel")
                + "au cours de modélisation le "+this.getCourseSession()
                + (isPartTime() ? " et travail le "+ this.getWorkDay() : "");
    }
}
