package top.gnibbuq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="error")
public class ErrController implements ErrorController {

    private static final Logger logger = LoggerFactory.getLogger(ErrController.class);

    @Override
    public String getErrorPath() {
        logger.info("出错啦！进入自定义错误控制器");
        return "404";
    }

    @RequestMapping
    public String error() {
        return getErrorPath();
    }

}