package Registration;

import java.time.LocalDateTime;

public class User {

    String name ;
    LocalDateTime registrationDate;

    public User(String name, LocalDateTime registrationDate) {
        this.name = name;
        this.registrationDate = registrationDate;
    }
}
