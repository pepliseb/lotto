package pl.pepliseb.lotto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LottoContoller {

    @GetMapping("/")
    public String index(ModelMap modelMap) {

        return "index";
    }
}
