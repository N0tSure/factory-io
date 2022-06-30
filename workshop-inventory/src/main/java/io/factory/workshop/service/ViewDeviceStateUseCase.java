package io.factory.workshop.service;

import io.factory.workshop.model.State;

public interface ViewDeviceStateUseCase {

    State getDeviceState(DeviceQuery query);
}
