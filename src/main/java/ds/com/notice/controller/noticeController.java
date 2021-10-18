package ds.com.notice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Log4j2
@Controller
@RequestMapping({"/",""})
public class noticeController {
    @GetMapping({"/",""})
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("myname","이영돈");
        return mv;
    }
}