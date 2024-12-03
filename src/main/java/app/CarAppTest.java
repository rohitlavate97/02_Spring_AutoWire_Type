package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CarService;

public class CarAppTest {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Beans2.xml");
        CarService carService=context.getBean(CarService.class);
        carService.drive();
//        CarService c1=context.getBean(CarService.class);
//        System.out.println(c1.hashCode());
//        CarService c2=context.getBean(CarService.class);
//        System.out.println(c2.hashCode());
        //the commented code is to show that only one object is created by IOC
    }
}
