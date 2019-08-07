package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhan
 * @date 2019/8/7 21:07
 */
@Controller
public class HelloController{
    @GetMapping("/hello")
    public String hello(@RequestParam(name ="name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
