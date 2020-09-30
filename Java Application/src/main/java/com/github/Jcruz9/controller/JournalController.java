package com.github.Jcruz9.controller;

import com.github.Jcruz9.service.DietJournalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JournalController {
    private DietJournalServices dietJournalServices;

    @Autowired
    public JournalController(DietJournalServices dietJournalServices)
    {
        this.dietJournalServices=dietJournalServices;
    }

    @
}
