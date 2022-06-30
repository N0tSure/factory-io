package io.factory.workshop.service;

import io.factory.workshop.model.Devices;

public interface SearchDeviceUseCase {

    Devices search(DeviceSearchQuery query);
}
