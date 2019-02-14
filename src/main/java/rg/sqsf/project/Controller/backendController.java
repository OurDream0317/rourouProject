package rg.sqsf.project.Controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import rg.sqsf.project.model.Car;
import rg.sqsf.project.model.News;
import rg.sqsf.project.service.AdminService;
import rg.sqsf.project.service.CarService;
import rg.sqsf.project.service.NewsService;
import rg.sqsf.project.service.UserService;

import java.util.List;


@Controller
public class backendController {
    @Autowired
    private NewsService newsService;
    @Autowired
    private CarService carService;
    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;
    @RequestMapping("/backend/get/news")
    @ResponseBody
    public String findNews(){
        List<News> list=newsService.findNews();
        return JSON.toJSONString(list);
    }
    @RequestMapping("/backend/get/car")
    @ResponseBody
    public String findCars(){
        List<Car> list=carService.findCars();
        return JSON.toJSONString(list);
    }
    @RequestMapping("/backend/get/users")
    @ResponseBody
    public String findUsers(){
List list=userService.findUsers();
         return JSON.toJSONString(list);
    }
    @RequestMapping("/backend/get/admin")
    @ResponseBody
    public String findAdmins(){
        List list=adminService.findAdmins();
        return JSON.toJSONString(list);
    }
}
