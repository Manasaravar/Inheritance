public class Master extends Teacher{
private String master;

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public Master(String lastName, String firstName, int age, String speciality, int experience, String master) {
        super(lastName, firstName, age, speciality, experience);
        setMaster(master);
        System.out.println("MConstructor:\t" + Integer.toHexString(hashCode()));

    }

    public Master(Human human, String speciality, int experience, String master) {
        super(human, speciality, experience);
        setMaster(master);
        System.out.println("MCopyConstructor:\t" + Integer.toHexString(hashCode()));
    }

    @Override
    public String toString() {
        return super.toString() + " " + master;
    }
}
