package io.factory.workshop.model;

import lombok.Value;

/**
 * Represents a device model.
 */
@Value
public class DeviceModel {

    /**
     * Model name.
     */
    String name;

    /**
     * Device serial number.
     */
    String serialNumber;

    /**
     * Device type.
     */
    DeviceType type;
}
