package TestJobs.problems.Object;

public class Filial {
    private Integer Id;

    private String name;

    public Filial(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Filial [Id=" + Id + ", name=" + name + "]";
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
