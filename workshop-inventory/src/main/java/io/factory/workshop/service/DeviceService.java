package io.factory.workshop.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Multimap;
import io.factory.workshop.model.DeviceInfo;
import io.factory.workshop.model.DeviceModel;
import io.factory.workshop.model.DeviceType;
import io.factory.workshop.model.State;
import lombok.RequiredArgsConstructor;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DeviceService {

    private final Path dataFilePath;
    private final Path deviceJoiningFilePath;
    private final ObjectMapper objectMapper;

    /**
     * In-mem data storage.
     */
    private Map<UUID, DeviceInfo> dataReferenceStorage;
    private List<DeviceInfo> linearDataStorage;
    private Multimap<DeviceInfo, DeviceInfo> jointDeviceStorage;

    private DeviceInfo readDeviceInfo(final String row) {
        final List<String> tokens = Arrays.stream(row.split(","))
                .map(s -> s.replace("\"", ""))
                .collect(Collectors.toList());

        final UUID id = UUID.fromString(tokens.get(0));
        final var state = new State(tokens.get(1));
        final DeviceType deviceType = DeviceType.valueOf(tokens.get(4));
        final var model = new DeviceModel(tokens.get(2), tokens.get(3), deviceType);
        return new DeviceInfo(id, state, model);
    }
}
