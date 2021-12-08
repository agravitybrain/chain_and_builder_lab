package builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class UserTest {
    private User user;

    @org.junit.jupiter.api.Test
    void builder() {
        user = User.builder()
                .firstName("Marika")
                .lastName("Terebel`ka")
                .gender("female")
                .age(43)
                .occupation("Sales assistant")
                .weight(61)
                .build();

        assertEquals("User(firstName=Marika, lastName=Terebel`ka, occupations=[Sales assistant], gender=female, age=43, weight=61)", user.toString());
    }
}