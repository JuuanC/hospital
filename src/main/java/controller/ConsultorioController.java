package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("prueba")
public class ConsultorioController {

    @GetMapping("list")
    public String getList(){
        return "asdasdasdasd";
    }
}
