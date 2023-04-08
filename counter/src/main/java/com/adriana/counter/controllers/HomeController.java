package com.adriana.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(HttpSession session) {
        // If the count is not already in session
        if (session.getAttribute("count") == null) {
            // Use setAttribute to initialize the count in session
            session.setAttribute("count", 0);
        } else {
            // increment the count by 1 using getAttribute and setAttribute
            int count = (int) session.getAttribute("count");
            session.setAttribute("count", count + 1);
        }
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String showCount(HttpSession session, Model model) {
        Integer currentCount = (Integer) session.getAttribute("count");
        model.addAttribute("countToShow", currentCount);
        return "showCount.jsp";
    }
}
