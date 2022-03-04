package Application;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyLocationController{
    HashMap<Integer, MyLocation> myLocations = new HashMap<Integer, MyLocation>();
    int count = 0;
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    @GetMapping("/addlocation")
    public String location() {
        return "addlocation.html";
    }
    @GetMapping("/browselocations")
    public String browselocations(Model model) {
        model.addAttribute("myLocations", myLocations);
        return "browselocations.html";
    }
    @GetMapping("/findclosestlocation")
    public String findclosestlocation() {
        return "findclosestlocation.html";
    }
    @PostMapping("/addlocationP")
    public @ResponseBody void MyLocation(@RequestParam int xcoord, @RequestParam int ycoord, @RequestParam String shortNote, HttpServletResponse response) throws IOException{
        MyLocation Temp = new MyLocation();
        Temp.setId(count);
        Temp.setX(xcoord);
        Temp.setY(ycoord);
        Temp.setShortNote(shortNote);
        Temp.setComments("");
        myLocations.put(count, Temp);
        count = count + 1;
        try{
            response.sendRedirect("/browselocations");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}