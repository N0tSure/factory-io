package io.factory.workshop.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DeviceInfoRecord {
    private UUID id;
    private String state;
    private String model;
    private String serial;
    private String type;
}
