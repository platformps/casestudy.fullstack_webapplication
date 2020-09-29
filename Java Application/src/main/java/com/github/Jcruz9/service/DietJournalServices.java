package com.github.Jcruz9.service;

import com.github.Jcruz9.model.DietJournal;
import com.github.Jcruz9.repository.DietJournalRepository;
import org.springframework.stereotype.Service;

@Service
public class DietJournalServices {
    private DietJournalRepository repository;

    public DietJournalServices(DietJournalRepository repository)
    {
        this.repository=repository;
    }
    public DietJournal create(DietJournal newJournal)
    {
        DietJournal persistedJournal=repository.save(newJournal);
        return persistedJournal;
    }


}
