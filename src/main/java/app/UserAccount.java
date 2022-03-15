package app;
import java.io.Serializable;

@Component
@SessionScope
public class UserAccount {
    private String username;
    private String email;
    private String password;

    public String getUsername(){return username;}
    public String getEmail(){return email;}
    public String getPassword(){return password;}

    public void setUsername(String username){this.username = username;}
    public void setEmail(String email){this.email = email;}
    public void setPassword(String password){this.password = password;}
}