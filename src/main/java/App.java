

import com.perscholas.model.Department;
import com.perscholas.model.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        Teacher t1 = new Teacher();
        t1.setTeachername("July Salas");
        t1.setSalary("100");

        Teacher t2 = new Teacher();
        t2.setTeachername("Jennt Finch");
        t2.setSalary("10000");

        Teacher t3 = new Teacher();
        t3.setTeachername("Jamie");
        t3.setSalary("25000");

        Teacher t4 = new Teacher();
        t4.setTeachername("SID ROSE");
        t4.setSalary("3000");

        Teacher t5 = new Teacher();
        t5.setSalary("200");
        t5.setTeachername("Ali");

        //Add teacher entity object to the list
        List<Teacher> teachlist = new ArrayList();
        teachlist.add(t1);
        teachlist.add(t2);
        teachlist.add(t3);
        teachlist.add(t4);
        teachlist.add(t5);
        session.persist(t1);
        session.persist(t2);
        session.persist(t3);
        session.persist(t4);
        session.persist(t5);
        //Creating Department
        Department department = new Department();
        department.setDname("Development");
        department.setTeacherList(teachlist);
        //Storing Department
        session.persist(department);
        t.commit();    }

//        Department dep = new Department();
//        dep.setDname("It");
//
//        Department dep2 = new Department();
//        dep2.setDname("HR");
//
//        // creating teacher
//        Teacher t1 = new Teacher();
//        t1.setDep(dep);
//        t1.setSalary("1000");
//        t1.setTeachername("Julio");
//
//        Teacher t2 = new Teacher();
//        t2.setDep(dep);
//        t2.setSalary("2220");
//        t2.setTeachername("Marsiol");
//
//        Teacher t3 = new Teacher();
//        t3.setDep(dep);
//        t3.setSalary("30000");
//        t3.setTeachername("James");
//
//        Teacher t4 = new Teacher();
//        t4.setDep(dep2);
//        t4.setSalary("40000");
//        t4.setTeachername("Joseph");
//
//        //Storing Department in database
//        session.persist(dep);
//        session.persist(dep2);
//
//        //Storing teachers in database
//        session.persist(t1);
//        session.persist(t2);
//        session.persist(t3);
//        session.persist(t4);
//        t.commit();










    }