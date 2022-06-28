package io.factory.workshop.model;

import lombok.Value;

import java.util.UUID;

/**
 * Represents an abstract factory workshop device.
 */
@Value
public class Device {

    /**
     * Device identifier.
     */
    UUID id;

    /**
     * Device state.
     */
    State state;

    /**
     * Device model.
     */
    DeviceModel model;
}
