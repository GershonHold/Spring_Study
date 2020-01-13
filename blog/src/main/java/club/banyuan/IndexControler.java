package club.banyuan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexControler {
    @GetMapping("/users/{username:[a-z0-9_]+}/blogs/{blogid}")
    @ResponseBody
    String findBlogs(@PathVariable String username,@PathVariable String blogid){
        System.out.println("IndexControler invoked!");
        return "<h1>You username is "+username +"<h1>"+"<h2>"+blogid+" is your id <h2>";
    }

}
