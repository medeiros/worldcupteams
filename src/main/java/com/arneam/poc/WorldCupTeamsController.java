package com.arneam.poc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class WorldCupTeamsController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/WorldCupTeams")
    public String WorldCupTeams(Model model, @RequestParam(value="group", required=false, defaultValue="E") String group) {
        switch(group) {
            case "A":
                model.addAttribute("teams", groupA());
                break;
            case "B":
                model.addAttribute("teams", groupB());
                break;
            case "C":
                model.addAttribute("teams", groupC());
                break;
            case "D":
                model.addAttribute("teams", groupD());
                break;
            case "E":
                model.addAttribute("teams", groupE());
                break;
            case "F":
                model.addAttribute("teams", groupF());
                break;
            case "G":
                model.addAttribute("teams", groupG());
                break;
            case "H":
                model.addAttribute("teams", groupH());
                break;
            default:
                model.addAttribute("teams", new ArrayList<String>());
                break;
        }
        model.addAttribute("group", group);
        return "worldCupTeams";
    }

    private List<String> groupA() {
        return Arrays.asList("Russia", "S.Arabia", "Egypt", "Uruguay");
    }

    private List<String> groupB() {
        return Arrays.asList("Portugal", "Spain", "Morocco", "Iran");
    }

    private List<String> groupC() {
        return Arrays.asList("France", "Australia", "Peru", "Denmark");
    }

    private List<String> groupD() {
        return Arrays.asList("Argentina", "Iceland", "Croatia", "Nigeria");
    }

    private List<String> groupE() {
        return Arrays.asList("Brazil", "Switzld", "C.Rica", "Serbia");
    }

    private List<String> groupF() {
        return Arrays.asList("Germany", "Mexico", "Sweden", "S.Korea");
    }

    private List<String> groupG() {
        return Arrays.asList("Belgium", "Panama", "Tunisia", "England");
    }

    private List<String> groupH() {
        return Arrays.asList("Poland", "Senegal", "Colombia", "Japan");
    }

}
