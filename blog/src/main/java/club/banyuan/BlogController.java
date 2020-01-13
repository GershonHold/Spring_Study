package club.banyuan;

import club.banyuan.bean.BolgUser;
import club.banyuan.bean.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@ResponseBody
public class BlogController {

//    @GetMapping("/blog")
//    BolgUser getusername(@Valid BolgUser bloguser){
//        return bloguser;
//    }
    @GetMapping("/user")
    PageInfo get_page_size(@RequestParam() Integer page,@RequestParam() Integer size){
        PageInfo pageinfo=new PageInfo(page,size);
        return pageinfo;
    }

}