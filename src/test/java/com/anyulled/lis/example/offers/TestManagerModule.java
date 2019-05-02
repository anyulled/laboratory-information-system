package com.anyulled.lis.example.offers;

import com.anyulled.lis.model.Container;
import com.anyulled.lis.model.Patient;
import com.anyulled.lis.model.RocheOrder;
import com.anyulled.lis.model.Sample;
import com.anyulled.lis.model.enums.SampleType;
import com.anyulled.lis.service.Visitor;
import com.anyulled.lis.service.impl.RocheTestVisitor;
import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import com.anyulled.lis.service.legacy.SodiumTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

@Slf4j
public class TestManagerModule {

    @Test
    public void testExtendedFunctionalityA() {
        Patient patient = Patient.builder()
                .firstName("test")
                .lastName("patient")
                .birthYear(LocalDate.of(1956, Month.JULY, 22))
                .build();

        Sample sample = Sample.builder()
                .label("Sample")
                .type(SampleType.BLOOD).build();

        Container container = Container.builder()
                .label("Container")
                .patient(patient)
                .sample(sample)
                .build();

        Visitor visitor = new RocheTestVisitor();
        RocheOrder order = new RocheOrder(generateUuid());
        order.setContainer(container);
        order.getRocheTests().add(new GlucoseTest(generateUuid()));
        order.getRocheTests().add(new SodiumTest(generateUuid()));
        order.getRocheTests().add(new GlucoseTest(generateUuid()));
        order.getRocheTests().add(new HemoglobinTest(generateUuid()));
        order.accept(visitor);

        order.getRocheTests().forEach(laboratoryTest -> {
            log.info("Test property b {}", laboratoryTest.getCommonPropertyA());
            log.info("Test property b {}", laboratoryTest.getCommonPropertyB());
            log.info("Test Type {}", laboratoryTest.getTestType());
        });

    }

    private String generateUuid() {
        return UUID.randomUUID().toString();
    }
}
