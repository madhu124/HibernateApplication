package HibApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory fact=new Configuration().configure().buildSessionFactory();

		Session session=fact.openSession();
		Transaction trans=session.beginTransaction();
		
		Manager m1 = new Manager(1,"m1");
		Manager m2 = new Manager(2,"m2");
		Manager m3 = new Manager(3,"m3");
		Manager m4 =new Manager(4,"m4");


		
		FlowersShop fs1 = new FlowersShop(12, "rose", 2345);
fs1.getC().add(m1);
fs1.getC().add(m2);
FlowersShop fs2 = new FlowersShop(13, "WhiteRrose", 8845);
fs2.getC().add(m4);
fs2.getC().add(m3);


session.save(fs1);
session.save(fs2);

session.save(m1);
session.save(m2);
session.save(m3);
session.save(m4);


trans.commit();
session.close();
		

		
		
	}

}
