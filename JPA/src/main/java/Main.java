import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("blog-db");
        EntityManager emf = entityManagerFactory.createEntityManager();
        try {
            User user = new User();
            user.setUsername("Stamat");
            user.setPasswordHash("123456");
            user.setFullName("Stamat Stamatov");
            emf.getTransaction().begin();
            emf.persist(user);
            emf.getTransaction().commit();
        }finally {
            emf.close();
            entityManagerFactory.close();
        }
    }
}
