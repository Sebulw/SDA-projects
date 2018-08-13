package pl.sda.tests;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import pl.sda.tests.users.Database;
import pl.sda.tests.users.User;

public class UsersTest {

    @Test
    public void userTest1() {
        User user1 = new User("Sebix", "hasło");

        Assertions.assertThat(user1.getUsername())
                .as("user not created")
                .isNotEmpty();
    }

    @Test
    public void databadeTest() {
        Database newDatabase = new Database();
        User user1 = new User("Sebix", "mypassword");
        User user2 = new User("Rysiu", "rysiowehasło");
        User user3 = new User("Andrzej", "andrzejowehasło");
        User user4 = new User("Artur", "hasłoartura");
        User user5 = new User("Wojtek", "hasłowojtka");
        User user6 = new User("Zbyszek", "zbyszkowehasło");

        Assertions.assertThat(newDatabase.getUsers())
                .as("Database is null")
                .isNotNull()
                .hasSize(6);
    }
}
