package com.anyulled.lis.example.offers;

import com.anyulled.lis.model.Container;
import com.anyulled.lis.model.Order;
import com.anyulled.lis.model.Patient;
import com.anyulled.lis.model.Sample;
import com.anyulled.lis.model.enums.SampleType;
import com.anyulled.lis.service.impl.TestVisitorA;
import com.anyulled.lis.service.impl.TestVisitorB;
import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

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

        Order order = Order.builder()
                .container(container)
                .label("order")
                .test(new GlucoseTest())
                .test(new HemoglobinTest())
                .test(new TestVisitorA())
                .test(new TestVisitorB())
                .build();

        order.getTests().forEach(laboratoryTest -> {
            log.info("executing {} test", laboratoryTest.getTestType().toString().toLowerCase());
            log.info("Test property a {}", laboratoryTest.getCommonPropertyA());
            log.info("Test property b {}", laboratoryTest.getCommonPropertyB());
            log.info("Test property c {}", laboratoryTest.getCommonPropertyC());

        });

    }
}
