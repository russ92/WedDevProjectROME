package app;

import java.io.IOException;
import java.util.HashMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.Model;

@Controller
public class MyLocationController {
    HashMap<Integer, MyLocation> myLocations = new HashMap<Integer, MyLocation>();
    int count = 0;

    @GetMapping("/")
    public String index(){
        return "index.html";
    }


    @GetMapping("/addlocation")
    public String location(){
        return "addlocation.html";
    }


    @GetMapping("/findclosestlocation")
    public String findclosestlocation(){
        return "findclosestlocation.html";
    }


    @PostMapping("/addlocation")
    public @ResponseBody void addlocation(@RequestParam int xcoord, @RequestParam int ycoord, @RequestParam String shortNote, HttpServletResponse response, MyLocation data) throws IOException {

        try {
            response.sendRedirect("/browselocations");
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        data.setXcoord(xcoord);
        data.setYcoord(ycoord);
        data.setShortNote(shortNote);
        myLocations.put(count, data);
        count++;
    }


    @GetMapping("/browselocations")
    public String browseLocations(MyLocation myLocations, Model model) {
        model.addAttribute("ID", myLocations);
        return "browselocations.html";
    }


    @GetMapping("/view/{id}")
    public String viewLocations(){
        return "view.html";
    }
}