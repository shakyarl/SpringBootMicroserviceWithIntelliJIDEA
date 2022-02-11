package com.myplantdiary.enterprise;

import com.myplantdiary.enterprise.dto.Specimen;
import com.myplantdiary.enterprise.service.ISpecimenService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EnterpriseApplicationTests {

    @Autowired
    private ISpecimenService specimenService;
    private Specimen specimen;

    @Test
    void contextLoads() {
    }

    @Test
    void fetchSpecimenByID_returnsRedbudForID83(){
        givenSpecimenDataAreAvailable();
        whenSearchSpecimenWithID83();
        thenReturnOneEasterRedBudSpecimenForID83();
    }

    private void givenSpecimenDataAreAvailable() {

    }

    private void whenSearchSpecimenWithID83() {
        specimen = specimenService.fetchById(83);
    }

    private void thenReturnOneEasterRedBudSpecimenForID83() {
        String description = specimen.getDescription();
        assertEquals("Eastern Redbud", description);

    }

}
