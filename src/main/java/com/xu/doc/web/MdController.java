package com.xu.doc.web;

import com.xu.doc.common.bean.ExceptionType;
import com.xu.doc.common.exception.Response;
import com.xu.doc.common.utils.Log;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/md")
public class MdController {

    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = "test/html;charset=UTF-8")
    public String add() {
        return "/WEB-INF/add.jsp";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String save(@RequestBody String json) {
        Log.info(json);
        Log.info(JSONObject.fromObject(json));
        return Response.msg(ExceptionType.SUCCESS).toString();
    }
}
