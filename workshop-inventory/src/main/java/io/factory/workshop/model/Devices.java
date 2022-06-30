package io.factory.workshop.model;

import lombok.*;

import java.util.List;

/**
 * Result of search Devices.
 */
@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Devices {

    /**
     * Found devices.
     */
    private final List<DeviceInfo> content;

    /**
     * Total number of devices satisfying request.
     */
    private final long totalItems;

    /**
     * Number of devices returned in current result.
     */
    public int getItemsNumber() {
        return content.size();
    }
}
