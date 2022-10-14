package DI_IoC.mvc20220927hyeseong.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserTestRestApi {

    @GetMapping("/api/test/user/rest")
    public  String getUsername(){
        return "김준일";
    }
}
