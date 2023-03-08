package Demo;

import Domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertProduct {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;
        //Step-1  -->Active Hibernate Framework
        cfg=new Configuration();
        cfg=cfg.configure();
        cfg=cfg.addAnnotatedClass(Product.class);


        //Step-2  -->Establish Communication
        factory=cfg.buildSessionFactory();

        //Step-3 -->start the Session
        ses=factory.openSession();

        //Step-4  -->Create object of domain class
        Product p1=new Product (5,"AC", "ELECTRONICS",45000.500);

        tx=ses.beginTransaction();
        ses.save(p1);
        tx.commit();
        System.out.println("Product Added Successfully");
    }
}
