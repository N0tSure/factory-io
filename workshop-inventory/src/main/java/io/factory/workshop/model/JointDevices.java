package io.factory.workshop.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@EqualsAndHashCode(callSuper = true)
public class JointDevices extends Devices {

    private final DeviceInfo currentDevice;

    public JointDevices(
            final List<DeviceInfo> content,
            final long totalItems,
            final DeviceInfo currentDevice
    ) {
        super(content, totalItems);
        this.currentDevice = currentDevice;
    }
}
