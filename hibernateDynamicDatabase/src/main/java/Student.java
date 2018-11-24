import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
@Entity
public class Student {
    @Id
    @Column(name="rollNbr")
    private int rollNbr;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy="stud")
    private List<Laptop> laptop;

    public int getRollNbr() {
        return rollNbr;
    }

    public void setRollNbr(int rollNbr) {
        this.rollNbr = rollNbr;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
