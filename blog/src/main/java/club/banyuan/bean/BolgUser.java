package club.banyuan.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class BolgUser {

    private String username;

    public BolgUser(String username, int page, int size) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
