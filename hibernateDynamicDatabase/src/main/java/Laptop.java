import javax.persistence.*;

@Entity
public class Laptop {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="laptopName")
    private String laptopName;

    public Student getStud() {
        return stud;
    }

    public void setStud(Student stud) {
        this.stud = stud;
    }
    public void setLaptopName(String laptopName){
        this.laptopName = laptopName;
    }
    public String getLaptopName(){
        return laptopName;
    }

    @ManyToOne
    private Student stud;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
