package lab10.labSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    @SuppressWarnings("resource")
	public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("empSchoolComb.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
        emp1.empData();
        EmployeeSchool empSchool = (EmployeeSchool) context.getBean("empSchool");
        empSchool.spawnSchool();
    }
}
