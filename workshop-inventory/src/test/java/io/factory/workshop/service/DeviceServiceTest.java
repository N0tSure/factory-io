package io.factory.workshop.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import io.factory.workshop.dto.DeviceInfoRecord;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class DeviceServiceTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void test_00() throws IOException {
        final Resource resource = new ClassPathResource("data/device-info-data.json");

        final CollectionType type = objectMapper.getTypeFactory()
                .constructCollectionType(List.class, DeviceInfoRecord.class);

        final List<DeviceInfoRecord> deviceInfos = objectMapper.readValue(resource.getInputStream(), type);
        Assertions.assertThat(deviceInfos)
                .isNotEmpty();
    }

    @Test
    void test_01() {
        final var row = "\"83f3a7bd-1122-4d97-b493-a038c4b4a03d\",\"IDLE\"," +
                "\"Assembler MK I\",\"ASM\\00000000\",\"MACHINE\"";

        final List<String> tokens = Arrays.stream(row.split(","))
                .map(s -> s.replace("\"", ""))
                .collect(Collectors.toList());

        for (final String token : tokens) {
            Assertions.assertThat(token)
                    .doesNotStartWith("\"")
                    .doesNotEndWith("\"");
        }

    }

    @Test
    void test_02() {
    }

    @Test
    void test_03() {
    }

}