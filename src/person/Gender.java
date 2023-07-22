package person;

public enum Gender {

    MALE("Férfi", "Male"),
    FEMALE("Nő", "Female"),
    GENDERSEMLEGES("Gendersemleges", "Genderfree");

    private String magyarNev;
    private String angolNev;

    Gender(String magyarNev, String angolNev) {
        this.magyarNev = magyarNev;
        this.angolNev = angolNev;
    }

    public String getMagyarNev() {
        return magyarNev;
    }

    public void setMagyarNev(String magyarNev) {
        this.magyarNev = magyarNev;
    }

    public String getAngolNev() {
        return angolNev;
    }

    public void setAngolNev(String angolNev) {
        this.angolNev = angolNev;
    }

}
