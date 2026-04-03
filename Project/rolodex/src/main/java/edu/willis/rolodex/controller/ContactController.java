package edu.willis.rolodex.controller;

import edu.willis.rolodex.model.*;
import edu.willis.rolodex.service.ContactService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * MVC CONTROLLER
 */

@Controller
public class ContactController {

    private ContactService service = new ContactService();

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("contact", new FriendContact());
        return "form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute Contact contact) {
        service.add(contact);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("contacts", service.getAll());
        return "list";
    }
}