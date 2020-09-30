package com.github.Jcruz9.service;

import com.github.Jcruz9.model.DietJournal;
import com.github.Jcruz9.repository.DietJournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DietJournalServices {
    private DietJournalRepository repository;

    @Autowired
    public DietJournalServices(DietJournalRepository repository)
    {
        this.repository=repository;
    }

    public DietJournal createDiet(String dietName)
    {
        DietJournal dietJournal= new DietJournal();
        dietJournal.setDietName(dietName);
        dietJournal=repository.save(dietJournal);
        return  dietJournal;
    }


}
