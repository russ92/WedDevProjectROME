package app;

import java.io.IOException;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;

@Controller
public class USerAccountController {
    HashMap<Integer, UserAccount> userAccounts = new HashMap<Integer, UserAccount>();
    int count = 0;

    @GetMapping("/signup")
    public String signup(){
        return "signup.html";
    }

    @PostMapping("/signup")
    public @ResponseBody void signup(@RequestParam String username, @RequestParam String password, HttpServletResponse response, UserAccount data) throws IOException {

        try {
            response.sendRedirect("/home");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        data.setUsername(username);
        data.setPassword(password);
        userAccounts.put(count, data);
        count++;
    }
}