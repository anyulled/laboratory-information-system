package com.anyulled.lis.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Container {
    String label;
    Patient patient;
    Sample sample;
}
