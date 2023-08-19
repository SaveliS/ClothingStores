package com.massage.massageK.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Отмечает, что является контроллером. Отвечаем за определенные адреса.
@Slf4j // Логер, помогает отслеживать состояние объектов.
public class LandingController {

    @GetMapping("/")
    public String GetLandingPage(Model model){
        return "landingPage/landing";
    }
}
