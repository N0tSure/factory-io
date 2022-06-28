package io.factory.workshop.model;

import lombok.Value;

import java.util.List;

/**
 * Result of search Devices.
 */
@Value
public class Devices {

    /**
     * Found devices.
     */
    List<Device> content;

    /**
     * Total number of devices satisfying request.
     */
    long totalItems;

    /**
     * Number of devices returned in current result.
     */
    public int getItemsNumber() {
        return content.size();
    }
}
