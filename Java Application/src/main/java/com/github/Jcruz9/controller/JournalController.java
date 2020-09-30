package com.github.Jcruz9.controller;

import com.github.Jcruz9.model.Account;
import com.github.Jcruz9.model.DietJournal;
import com.github.Jcruz9.model.Food;
import com.github.Jcruz9.service.DietJournalServices;
import com.github.Jcruz9.service.FoodServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/DietJournal_Controller")
public class JournalController {
    private DietJournalServices dietJournalServices;

    @Autowired
    public JournalController(DietJournalServices dietJournalServices)
    {
        this.dietJournalServices=dietJournalServices;
    }

    @PostMapping("/")
    public ResponseEntity<DietJournal> create(@RequestBody DietJournal dietJournal)
    {
        return new ResponseEntity<>(dietJournalServices.create(dietJournal), HttpStatus.CREATED);
    }


    @PostMapping("/{id}")
    public ResponseEntity<DietJournal> updateById(@PathVariable Long id,@RequestBody DietJournal dietJournal)
    {
        return new ResponseEntity<>(dietJournalServices.update(id,dietJournal),HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Iterable<DietJournal>> readAll() {
        return new ResponseEntity<>(dietJournalServices.accountIterable(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DietJournal> show(@PathVariable Long id) {
        return new ResponseEntity<>(dietJournalServices.account(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id)
    {
        return new ResponseEntity<>(dietJournalServices.delete(id),HttpStatus.OK);
    }


//    @PostMapping(value = "/journalName")
//    public String  JournalName(@RequestParam("dietName") String dietName,ModelMap model)
//    {
//        model.put("dietName",dietName);
//        return "foodForm";
//    }
//
//    @GetMapping("journalName")
//    public String getJournalForm() {
//        return "journalName";
//    }
}
