package io.factory.workshop.service;

import lombok.Value;

import java.util.UUID;

@Value
public class JointDevicesQuery {
    UUID deviceID;
    int page;
    int pageSize;
}
