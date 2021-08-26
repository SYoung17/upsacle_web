package dobby.upscale.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {



    @RequestMapping(value = "/html/{file}")
    public String view(@PathVariable("file") String file) {


        return "html/" + file;
    }

}
