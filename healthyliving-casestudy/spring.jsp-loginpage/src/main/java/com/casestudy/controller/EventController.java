package com.casestudy.controller;

import com.casestudy.model.Event;
import com.casestudy.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class EventController {
    private EventService EventService;
@Autowired
    public EventController(EventService eventService) {
        EventService = eventService;
    }

    @InitBinder
    public void initBinder(WebDataBinder binder){
        // Date - dd/mm/yyyy
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(dateFormat,false));
    }
    @RequestMapping(value = "/list-Events", method = RequestMethod.GET)
    public String showEvent(ModelMap model) {
        String name = getLoggedInUserName(model);
        model.put("Events",EventService.getEventByUser(name));
        // model insert to do service
        return "list-Events";
    }
    private String getLoggedInUserName(ModelMap model) {
        Object principal = SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getPrincipal();
        if (principal instanceof UserDetails){
            return ((UserDetails) principal).getUsername();
        }
        return principal.toString();
    }

    @RequestMapping(value = "/add-Event", method =  RequestMethod.GET)
    public String showAddEventPage(ModelMap model){
        model.addAttribute("Events", new Event());
        model.addAttribute("Event", new Event());
        return "Event";
    }

    @RequestMapping(value = "/delete-Event", method = RequestMethod.GET)
    public String deleteEvent(@RequestParam long id){
        EventService.deleteEvent(id);
        return "redirect:/list-Events";
    }

    @RequestMapping(value = "/update-Event", method = RequestMethod.GET)
    public String showUpdateEventPage(@RequestParam long id, ModelMap model){
        Event Event = EventService.getEventById(id).get();
        model.put("Event", Event);
        return "Event";
    }
    @RequestMapping(value = "/update-Event", method = RequestMethod.POST)
    public String updateEvent(ModelMap model, @Valid Event Event, BindingResult result){
        if (result.hasErrors()) {
            return "Event";
        }
        Event.setName(getLoggedInUserName(model));
        EventService.updateEvent(Event);
        return "redirect:/list-Events";
    }
    @RequestMapping(value = "/add-Event", method = RequestMethod.POST)
    public String addEvent(ModelMap model,  @Valid Event Event, BindingResult result){
        if (result.hasErrors()){
            return "Event";
        }
        Event.setName(getLoggedInUserName(model));
        EventService.saveEvent(Event);
        return "redirect:/list-Events";
    }
}
