package ca.sheridancollege.abdelmhe.controllers;

import java.util.Random;

import ca.sheridancollege.abdelmhe.GameOptions;
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
        /*Computer picks one option randomly*/
        String[] list = {"Stone", "Paper", "Scissor"};
        Random r = new Random();
        String comp = list[r.nextInt(list.length)];
        userData.set_ComputerOption(comp);
        /*Assign the randomly picked option to model above*/

        switch(_gameOption) {
            //Case when user selected Scissor option
            case "Scissor":
                userData.set_gameOptions(GameOptions.Scissor);
                if(userData.get_ComputerOption().equals("Paper")) {
                    userData.set_Result("Scissor cuts paper. You win!!");
                }
                else if(userData.get_ComputerOption().equals("Stone")) {
                    userData.set_Result("Rock crushes scissors. You lose!!");
                }
                else if(userData.get_ComputerOption().equals("Scissor")) {
                    userData.set_Result("It's a tie!");
                }
                break;
            case "Paper":
                //Case when user selected Paper option
                userData.set_gameOptions(GameOptions.Paper);
                if(userData.get_ComputerOption().equals("Paper")) {
                    userData.set_Result("It's a tie!");
                }
                else if(userData.get_ComputerOption().equals("Stone")) {
                    userData.set_Result("Paper eats rock. You win!!");
                }
                else if(userData.get_ComputerOption().equals("Scissor")) {
                    userData.set_Result("Scissor cuts paper. You lose!!");
                }
                break;
            case "Stone":
                //Case when user selected Stone option
                userData.set_gameOptions(GameOptions.Stone);
                if(userData.get_ComputerOption().equals("Paper")) {
                    userData.set_Result("Paper eats rock. You lose!!");
                }
                else if(userData.get_ComputerOption().equals("Stone")) {
                    userData.set_Result("It's a tie!");
                }
                else if(userData.get_ComputerOption().equals("Scissor")) {
                    userData.set_Result("Rock crushes scissors. You win!!");
                }
                break;
        }
        //Send the final model to view with results
        model.addAttribute("UserData", userData);

        return "output";
    }
}




