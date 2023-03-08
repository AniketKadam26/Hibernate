package Demo;

import Domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DisplayProduct {
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
        int id=5;
        Product p=ses.load(Product.class,id);

        System.out.println(p.getProductId());
        System.out.println(p.getProductName());
        System.out.println(p.getProductCategory());
        System.out.println(p.getProductPrice());
    }

}
