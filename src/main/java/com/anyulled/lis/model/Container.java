package com.anyulled.lis.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Container {
    String label;
    Patient patient;
    Sample sample;
}
