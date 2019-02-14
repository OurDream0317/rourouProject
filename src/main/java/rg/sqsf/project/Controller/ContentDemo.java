package rg.sqsf.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/content")
public class ContentDemo {
    @RequestMapping("/news")
    public String news(Model model){
        return "news";
    }
    @RequestMapping("/addNews")
    public String addNews(Model model){
        return "addNews";
    }
    @RequestMapping("/user")
    public String user(Model model){
        return "user";
    }
    @RequestMapping("/car")
    public String car(){
        return "car";
    }
    @RequestMapping("/order")
    public String order(){
        return "order";
    }
    @RequestMapping("/message")
    public String message(){
        return "message";
    }
    @RequestMapping("/admin")
    public String admin(){
        return "admin";
    }
}
