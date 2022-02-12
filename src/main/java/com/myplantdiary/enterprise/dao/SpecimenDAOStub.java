package com.myplantdiary.enterprise.dao;

import com.myplantdiary.enterprise.dto.Specimen;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class SpecimenDAOStub implements ISpecimenDAO{

    Map<Integer, Specimen> allSpecimens = new HashMap<>();

    @Override
    public Specimen save(Specimen specimen) throws Exception {
        Integer specimenID = Integer.parseInt(specimen.getSpecimenId());
        allSpecimens.put(specimenID, specimen);
        return specimen;
    }

    @Override
    public List<Specimen> fetchAll() {
        List<Specimen> returnSpecimens = new ArrayList(allSpecimens.values());
        return returnSpecimens;
    }

    @Override
    public Specimen fetch(int id) {
        return allSpecimens.get(id);
    }

    @Override
    public void delete(int id) {
        allSpecimens.remove(id);
    }
}
