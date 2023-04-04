package corn.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employ {

	public static void main(String[] args) {
		
	ApplicationContext contexts =	new ClassPathXmlApplicationContext("corn/springcore/springcore/collections/collectionConfig.xml");
	CollectionsInSpring emp1 = (CollectionsInSpring) contexts.getBean("emp1");
	System.out.println(emp1.geteName());
	System.out.println(emp1.getPhone());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getCources()); 	
	}

}
