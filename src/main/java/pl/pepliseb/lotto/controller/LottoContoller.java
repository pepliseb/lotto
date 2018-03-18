package pl.pepliseb.lotto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.pepliseb.lotto.model.Lotto;

@Controller
public class LottoContoller {

    @GetMapping("/")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("numbers", Lotto.generateLottoNumbers());
        return "index";
    }
}
