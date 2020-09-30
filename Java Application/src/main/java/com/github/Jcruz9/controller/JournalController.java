package com.github.Jcruz9.controller;

import com.github.Jcruz9.model.Account;
import com.github.Jcruz9.model.DietJournal;
import com.github.Jcruz9.service.DietJournalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JournalController {
    private DietJournalServices dietJournalServices;

    @Autowired
    public JournalController(DietJournalServices dietJournalServices)
    {
        this.dietJournalServices=dietJournalServices;
    }

    @RequestMapping(value = "/journalName",method = RequestMethod.POST)
    public String  JournalName(ModelMap model,String name)
    {
        DietJournal journal=dietJournalServices.createDiet(name);
        return "/foodForm";
    }

    @GetMapping(value = "/homepage")
    public String registration(Model model) {
        model.addAttribute("nextForm",new DietJournal());
        return "/journalName";
    }
}
