package io.factory.workshop.service;

import io.factory.workshop.model.JointDevices;

public interface ViewJointDevicesUseCase {

    JointDevices getJointDevices(final JointDevicesQuery query);
}
