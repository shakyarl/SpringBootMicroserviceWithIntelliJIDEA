package com.myplantdiary.enterprise.service;

import com.myplantdiary.enterprise.dto.Specimen;
import org.springframework.stereotype.Component;

@Component
public class SpecimenServiceStub implements ISpecimenService {
    @Override
    public Specimen fetchById(int id) {
        Specimen specimen = new Specimen();
        specimen.setDescription("Eastern Redbud");
        specimen.setSpecimenId("83");
        return specimen;
    }
}
