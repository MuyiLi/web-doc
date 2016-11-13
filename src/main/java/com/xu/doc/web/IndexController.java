package com.xu.doc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.io.File;


@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String index() {
        System.out.println("web page index -->");
        return "/WEB-INF/index.jsp";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String add() {
        System.out.println("web page index -->");
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest
                ().getSession();
        String path = session.getServletContext().getRealPath("static" + File.separator + "md"+File.separator);
        File file=new File(path,"test.html");
        return "/static/md/test.html";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String test() {
        System.out.println("web page index -->");
        return "/WEB-INF/simple.html";
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String test2() {
        System.out.println("web page index -->");
        return "/WEB-INF/test.jsp";
    }
}
