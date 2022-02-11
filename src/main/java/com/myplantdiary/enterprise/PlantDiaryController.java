package com.myplantdiary.enterprise;

import com.myplantdiary.enterprise.dto.Specimen;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * The controller fro Plant Diary REST endpoints and web UI
 * <p>
 * This class handles the CRUD operations for My Plant Diary specimens, via HTTP actions.
 * </p>
 * <p>
 * This class also serves HTML based web pages, for UI interactions with plant specimens.
 * </p>
 * @author Rahul Shakya
 */

@Controller
public class PlantDiaryController {

    /**
     * Handle the root (/) endpoint and return a start page.
     * @return
     */
    @RequestMapping("/")
    public String index(){
        return "start";
    }

    @GetMapping("/specimen")
    public ResponseEntity fetchAllSpecimens(){
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Fetch a specimen with the given ID.
     *
     * Given the parameter id, find a specimen that corresponds to this unique ID.
     *
     * Returns one of the following status codes:
     * 200: specimen found
     * 400: specimen not found
     *
     * @param id a unique identifier for this specimen
     */
    @GetMapping("/specimen/{id}/")
    public ResponseEntity fetchSpecimenById(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Create a new specimen object, given the data provided.
     *
     * returns one of the following status codes:
     * 201: successfully created a new specimen.
     * 409: unable to create a specimen, because it already exists.
     *
     * @param specimen a JSON representation of a specimen object.
     * @return the newly created specimen object.
     */
    @PostMapping(value = "/specimen", consumes = "application/json", produces = "application/json")
    public Specimen createSpecimen(@RequestBody Specimen specimen){
        return specimen;
    }

    @DeleteMapping("/specimen/{id}/")
    public ResponseEntity deleteSpecimen(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }
}
