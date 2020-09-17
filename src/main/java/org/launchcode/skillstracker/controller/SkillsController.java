package org.launchcode.skillstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class SkillsController {
    @GetMapping("/p")

    public String initList() {
       return "<h1> Skills Tracker</h1>" +
               "<h2>" +
               "<ol>" +
               "<li>Python</li>" +
               "<li>JavaScript</li>" +
               "<li>Go</li>" +
               "</ol>" +
               "</h2>"
               ;
    }
    @GetMapping("form")
    public String selectFavorite(){
        return  "<html>" +
                "<form method = 'post'>" +
                "<label> Contestant:" +
                "</label>" +
                "<br>" +
                "<input type = 'text' name = 'name'>" +
                "<br>" +
                "<label> My Preferred Language" +
                "<select name = 'favorite'>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Go'>Go</option>" +
                "</select>" +
                "</label>" +
                "<br>" +
                "<label> My Second Preferred Language " +
                "<select name = 'secondFavorite'>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'JavaScript'>JavaScript</option>" +
                "<option value = 'Go'>Go</option>" +
                "</select>" +
                "</label>" +
                "<br>" +
                "<label> My Third Preferred Language" +
                "<select name = 'thirdFavorite'>" +
                "<option value = 'Python'>Python</option>" +
                "<option value = 'JavaScript'>JavaScript</option>\" +\n" +
                "<option value = 'Go'>Go</option>" +
                "</select>" +
                "<br>" +
                "<input type = 'submit' value = 'Accept'" +
                "</form>" +
                "</html>";

    }
    @PostMapping("form")
    public String submission(@RequestParam String name,
                             @RequestParam String favorite,
                             @RequestParam String secondFavorite,
                             @RequestParam String thirdFavorite) {
        return "<h1>" +
                name +
                "<ol>" +
                "<li>" +
                favorite +
                "</li>" +
                "<li>" +
                secondFavorite +
                "</li>" +
                "<li>" +
                thirdFavorite +
                "</li>" +
                "</ol>";


    }



}
