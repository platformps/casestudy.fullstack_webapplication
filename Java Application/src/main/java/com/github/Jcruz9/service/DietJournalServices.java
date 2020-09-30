package com.github.Jcruz9.service;

import com.github.Jcruz9.model.Account;
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

//    public DietJournal createDiet(String dietName)
//    {
//        DietJournal dietJournal= new DietJournal();
//        dietJournal.setDietName(dietName);
//        dietJournal=repository.save(dietJournal);
//        return  dietJournal;
//    }


    public Iterable<DietJournal> accountIterable()
    {
        return repository.findAll();
    }
    public DietJournal account(Long id)
    {
        return repository.findById(id).get();
    }
    public DietJournal create(DietJournal dietJournal)
    {
        return repository.save(dietJournal);
    }
    public boolean delete(Long id)
    {
        repository.deleteById(id);
        return true;
    }
    public DietJournal update(Long id,DietJournal dietJournal)
    {
        DietJournal userAccount=repository.findById(id).get();
        userAccount.setDietName(dietJournal.getDietName());
        return repository.save(userAccount);
    }


}
