package academy.devdojo.maratonajava.javacore.Class30Association.domain;

public class School {
    private String nameE;
    private Teacher[] Teachers;
    

    public School(String nameE, Teacher[] teachers) {
        this.nameE = nameE;
        Teachers = teachers;
    }
    public void showTheDate(){
        System.out.println(this.nameE);
        if (Teachers == null) return;
            for (Teacher teacher : Teachers) {
                System.out.println(teacher.getNameP());
        }
       
    }
    /**
     * @return String return the nameE
     */
    public String getNameE() {
        return nameE;
    }

    /**
     * @param nameE the nameE to set
     */
    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    /**
     * @return Teacher[] return the Teachers
     */
    public Teacher[] getTeachers() {
        return Teachers;
    }

    /**
     * @param Teachers the Teachers to set
     */
    public void setTeachers(Teacher[] Teachers) {
        this.Teachers = Teachers;
    }

}
