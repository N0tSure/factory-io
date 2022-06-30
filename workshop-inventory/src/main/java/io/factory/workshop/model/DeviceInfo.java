package io.factory.workshop.model;

import lombok.Value;

import java.util.UUID;

/**
 * Represents factory workshop device info.
 */
@Value
public class DeviceInfo {

    /**
     * DeviceInfo identifier.
     */
    UUID id;

    /**
     * DeviceInfo state.
     */
    State state;

    /**
     * DeviceInfo model.
     */
    DeviceModel model;
}
