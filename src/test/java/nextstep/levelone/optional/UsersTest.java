package nextstep.levelone.optional;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UsersTest {

    @Test
    public void getUser() {
        Users users = new Users();
        assertThat(users.getUser("crong")).isEqualTo(new User("crong", 35));
    }


    @Test
    public void getDefaultUser() {
        Users users = new Users();
        assertThat(users.getUser("codesquard")).isEqualTo(Users.DEFAULT_USER);
    }

    @Test
    public void getUserV2() {
        Users users = new Users();
        assertThat(users.getUserV2("crong")).isEqualTo(new User("crong", 35));
    }


    @Test
    public void getDefaultUserV2() {
        Users users = new Users();
        assertThat(users.getUserV2("codesquard")).isEqualTo(Users.DEFAULT_USER);
    }
}
