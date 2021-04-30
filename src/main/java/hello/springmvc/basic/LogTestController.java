package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

        System.out.println("name = " + name);

        //이렇게 사용하면 안된다. trace 로그를 사용하지도 않는데 + 연산을 해서 쓸모없는 리소스 사용
        //log.trace(" trace my log = "+name);

        //log.trace("trace log = {}, {}", name, name2);
        log.trace(" trace log = {}", name);
        log.debug(" debug log = {}", name);
        log.info(" info log = {}", name);
        log.warn(" warn log = {}", name);
        log.error(" error log = {}", name);

        return "ok";
    }
}
