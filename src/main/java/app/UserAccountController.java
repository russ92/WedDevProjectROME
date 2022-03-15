package app;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;

@Controller
public class USerAccountController {
    @Autowired private UserAccount userAccount;


    HashMap<Integer, UserAccount> userAccounts = new HashMap<Integer, UserAccount>();
    int count = 0;


    @GetMapping("/signup")
    public String signup(){
        return "signup.html";
    }


    @PostMapping("/signup")
    public @ResponseBody void signup(@RequestParam String username, @RequestParam String email, @RequestParam String password, HttpServletResponse response, UserAccount data) throws IOException {

        try {
            response.sendRedirect("/home");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        data.setUsername(username);
        data.setPassword(password);
        data.setEmail(email);
        userAccounts.put(count, data);
        count++;
    }


    @PostMapping("/login")
    public @ResponseBody void login(@RequestParam String username, @RequestParam String password, HttpServletResponse response, UserAccount data) throws IOException {

        try {
            response.sendRedirect("/home");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        Iterator<E> accountsIterator = userAccounts.entrySet().iterator();
        while (accountsIterator.hasNext()) {
 
            Map.Entry mapElement = (Map.Entry)accountsIterator.next();
            UserAccount currentAccount = (String)mapElement.getValue();

            
            if (currentAccount.getUsername() == username && currentAccount.getPassword() == password) {
                HttpSession session = request.getSession();
            }
            else if (accountsIterator.hasNext() == false) {
                userAccount.setUsername(username);
            }
        }
    }
}