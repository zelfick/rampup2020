package mail2clients.rest;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {

    @RequestMapping("/test")
    public String test() {
        return "Mailing service - Rest Service - Test Succeeded! "+new Date().toString();
    }

}
