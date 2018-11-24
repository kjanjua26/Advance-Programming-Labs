import com.fasterxml.classmate.AnnotationConfiguration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        Student stud = new Student();
        stud.setName("Kamran");
        stud.setRollNbr(192135);
        Laptop laptop = new Laptop();
        laptop.setStud(stud);
        laptop.setLaptopName("Macbook");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(stud); entityManager.persist(laptop);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }
}
