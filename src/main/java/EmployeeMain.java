import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("sowmiya");
        employee.setDesignation("software developer");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();
        session.save(employee);

        session.getTransaction().commit();

        sessionFactory.close();
    }
}
