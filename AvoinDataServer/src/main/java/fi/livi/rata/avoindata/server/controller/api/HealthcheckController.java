package fi.livi.rata.avoindata.server.controller.api;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@XRayEnabled
public class HealthcheckController {
    @RequestMapping(method = RequestMethod.GET, path = "api")
    @ResponseBody
    public String healthcheck() {
        return "UP";
    }
}
