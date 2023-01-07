package com.project.ums.controller;

import com.project.ums.model.Facultate;
import com.project.ums.repo.FacultateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facultate")
public class FacultateController {

    @Autowired
    public FacultateRepo facultateRepo;

    @PostMapping("create")
    public Facultate createFacultate(@RequestBody Facultate facultate){
        return facultateRepo.save(facultate);
    }

    @GetMapping()
    public List<Facultate> facultati(){

        return facultateRepo.findAll();
    }
}
