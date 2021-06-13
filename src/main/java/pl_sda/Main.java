package pl_sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Message myMessage = context.getBean(Message.class);
        ExtraMessage myExtraMessage = context.getBean("extraMessage1",ExtraMessage.class);

        System.out.println(myExtraMessage.getText());
        System.out.println(myMessage.getText());

        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));


        // suma liczb pierwszych z zakresu 1,5
//        int result = IntStream.range(1, 5).reduce(0, (x, y) -> x + y);
        Book book = context.getBean("myBook",Book.class);
        System.out.println(book.toString());

        Book book2 = context.getBean("myBook2",Book.class);
        System.out.println(book2.toString());

        Book book3 = context.getBean("myBook3",Book.class);
        System.out.println(book3.toString());

        List<String> myList = context.getBean("myList", List.class);
        myList.stream().forEach((System.out::println));

        Map<String, String> myMap = context.getBean("myMap", Map.class);
        myMap.entrySet().forEach(System.out::println);

        Person person = context.getBean("myPerson",Person.class);
        System.out.println(person);

        Student student = context.getBean("myStudent",Student.class);
        System.out.println(student.toString());

        ((ConfigurableApplicationContext)context).close();
    }
}
