package rg.sqsf.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import rg.sqsf.project.model.Admin;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
           return "login";
    }
    @RequestMapping("/loginGo")
    public String loginGo(Model model, Admin admin){
           if(admin.getAdminname().equals("admin")&&admin.getAdminpwd().equals("admin")){
               model.addAttribute("url","/content/news");
               return "index";
           }
           return "login";
    }
    @RequestMapping("/user/register")
    public String register(){
        return "register";
    }
}
