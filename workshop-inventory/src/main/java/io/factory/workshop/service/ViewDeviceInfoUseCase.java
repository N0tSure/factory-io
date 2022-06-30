package io.factory.workshop.service;

import io.factory.workshop.model.DeviceInfo;

public interface ViewDeviceInfoUseCase {

    DeviceInfo getDevice(DeviceQuery query);
}
