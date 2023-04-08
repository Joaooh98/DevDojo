package academy.devdojo.maratonajava.javacore.Class30Association.domain;

public class TeacherEX {
    private String name;
    private String specialty;
    private SeminarEX [] seminarsT;

    
    public TeacherEX(String name) {
        this.name = name;
    }

    public TeacherEX(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }
    
    public TeacherEX(String name, String specialty, SeminarEX[] seminarsT) {
        this.name = name;
        this.specialty = specialty;
        this.seminarsT = seminarsT;
    }

    public void show(){
                System.out.println("-------------");
        System.out.println("Teacher "+this.name);
        if(this.seminarsT == null)return;
                System.out.println("### Seminar registered ###");
        for(SeminarEX seminar:this.seminarsT){
            System.out.println(seminar.getTitle());
            System.out.println(seminar.getAddressS().getAddress());
            if (seminar.getStudentS() == null || seminar.getStudentS().length == 0) continue;{
                System.out.println("nao temos alunos cadastrado (we do not have registered students)");
            }
                System.out.println("##########Student###########");
        for (StudentEX student :seminar.getStudentS()) {
            System.out.println(" Name student: "+student.getName()+"\n age student: "+student.getAge());
        }
        }
    }
    
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public SeminarEX[] getseminarsT() {
        return seminarsT;
    }

    public void setseminarsT(SeminarEX[] seminarsT) {
        this.seminarsT = seminarsT;
    }

}
