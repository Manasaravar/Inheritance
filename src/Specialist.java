public class Specialist extends Graduate{
    private String specialist;

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public Specialist(String lastName, String firstName, int age,
                      String speciality, String group, double rating, double attendance,
                      String subject, String specialist) {
       super(lastName, firstName, age, speciality, group, rating, attendance, subject);
       setSpecialist(specialist);
        System.out.println("SpecConstructor:\t" + Integer.toHexString(hashCode()));
    }

    public Specialist(Human human,
                      String speciality, String group, double rating, double attendance,
                      String subject,
                      String specialist) {
        super(human, speciality, group, rating, attendance, subject);
        setSpecialist(specialist);
    }

    @Override
    public String toString() {
        return super.toString() + " " + specialist;
    }
}

