package tn.esprit.biol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.biol.dao.DaysOffDao;
import tn.esprit.biol.entity.DaysOff;
import tn.esprit.biol.entity.User;
import tn.esprit.biol.service.DaysOffService;
import tn.esprit.biol.service.EmailService;

@RestController
@RequestMapping("/DaysOff")
public class DaysOffController {

@Autowired
    DaysOffService daysOffService;
    @Autowired
    private DaysOffDao daysOffDao;

    @PostMapping({"/RequestDaysOff"})

public DaysOff SendRequest(@RequestBody DaysOff daysOff)
{
    return daysOffService.sendLeaveRequest("houda.koubaa@esprit.tn", String.valueOf(daysOff.getId()),daysOff.getStartDate(),daysOff.getEndDate(),daysOff.getJustification());

}

}