package club.banyuan;

import club.banyuan.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class TestController {

    @GetMapping("/blog")
    String GetblogById(@RequestParam(name = "number",required = false,defaultValue = "10") Integer id){
    return  id.toString();
    }
    @GetMapping("/person")
    Person GetPerson(@RequestParam() String name,@RequestParam Integer age){

        var new_person=new Person(name,age);
        return  new_person;
    }
}
