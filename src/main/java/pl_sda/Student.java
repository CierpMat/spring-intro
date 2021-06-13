package pl_sda;

import lombok.Data;

@Data
public class Student extends Person{

    private String collageName;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                "lastName='" + getLastName() + '\'' +
                "collageName='" + collageName + '\'' +
                '}';
    }
}
