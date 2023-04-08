package academy.devdojo.maratonajava.javacore.Class30Association.domain;

public class SeminarEX {
    private String title;
    private LocationEX addressS;
    private StudentEX [] studentS;

    public SeminarEX(String title) {
        this.title = title;
    }
    

    public SeminarEX(String title, StudentEX[] studentS) {
        this.title = title;
        this.studentS = studentS;
    }


    public SeminarEX(String title, LocationEX addressS, StudentEX[] studentS) {
        this.title = title;
        this.addressS = addressS;
        this.studentS = studentS;
    }

    public LocationEX getAddressS() {
        return addressS;
    }

    public void setAddressS(LocationEX addressS) {
        this.addressS = addressS;
    }

    public StudentEX[] getStudentS() {
        return studentS;
    }

    public void setStudentS(StudentEX[] studentS) {
        this.studentS = studentS;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
