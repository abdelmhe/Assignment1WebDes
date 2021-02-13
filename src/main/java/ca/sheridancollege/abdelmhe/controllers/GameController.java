package ca.sheridancollege.abdelmhe.controllers;

import java.util.Random;

import ca.sheridancollege.abdelmhe.model.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GameController {

    @GetMapping({"/input"})
    public String inputPage(Model model) {
        model.addAttribute("UserData", new UserData());
        return "input";
    }

    @PostMapping("/output")
    public String outputPage(@RequestParam String _gameOption, Model model) {

        UserData userData = new UserData();
    }