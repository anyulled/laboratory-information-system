package com.anyulled.lis.example.offers;

import com.anyulled.lis.model.Container;
import com.anyulled.lis.model.Patient;
import com.anyulled.lis.model.RocheOrder;
import com.anyulled.lis.model.Sample;
import com.anyulled.lis.model.enums.SampleType;
import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.Visitor;
import com.anyulled.lis.service.impl.RocheTestVisitor;
import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import com.anyulled.lis.service.legacy.RocheTest;
import com.anyulled.lis.service.legacy.SodiumTest;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Condition;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class TestManagerModule {

    @Test
    public void testExtendedFunctionalityA() {
        Patient patient = generatePatient();
        Sample sample = generateSample();
        Container container = generateContainer(patient, sample);
        RocheOrder order = generateOrder(container);

        assertThat(order.getRocheTests().size()).isEqualTo(4);
        RocheTest firstTest = order.getRocheTests().get(0);
        RocheTest secondTest = order.getRocheTests().get(1);
        assertThat(firstTest.getUuid()).isNotEqualTo(secondTest.getUuid());
        assertThat(firstTest.getCommonPropertyB()).isEqualTo(secondTest.getCommonPropertyB());
        assertThat(order.getRocheTests()).areAtLeast(2, new Condition<>(rocheTest -> rocheTest.getTestType().equals(TestType.BIOCHEMISTRY), "Test type"));
    }

    private RocheOrder generateOrder(Container container) {
        Visitor visitor = new RocheTestVisitor();
        RocheOrder order = new RocheOrder(generateUuid());
        order.setContainer(container);
        order.getRocheTests().add(new GlucoseTest(generateUuid()));
        order.getRocheTests().add(new GlucoseTest(generateUuid()));
        order.getRocheTests().add(new SodiumTest(generateUuid()));
        order.getRocheTests().add(new HemoglobinTest(generateUuid()));
        order.accept(visitor);
        return order;
    }

    private Container generateContainer(Patient patient, Sample sample) {
        return Container.builder()
                .label("Container")
                .patient(patient)
                .sample(sample)
                .build();
    }

    private Sample generateSample() {
        return Sample.builder()
                .label("Sample")
                .type(SampleType.BLOOD).build();
    }

    private Patient generatePatient() {
        return Patient.builder()
                .firstName("test")
                .lastName("patient")
                .birthYear(LocalDate.of(1956, Month.JULY, 22))
                .build();
    }

    private String generateUuid() {
        return UUID.randomUUID().toString();
    }
}
