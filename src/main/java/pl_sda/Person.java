package pl_sda;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Person {

//    @Value("dwef")
    private String firstName;

//    @Value("#{bean.firstName != 'dwef' ? 'AAA' : 'BBB'}")
    private String lastName;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
