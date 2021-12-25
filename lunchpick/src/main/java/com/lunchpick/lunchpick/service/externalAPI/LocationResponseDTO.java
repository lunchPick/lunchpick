package com.lunchpick.lunchpick.service.externalAPI;

import lombok.Data;

@Data
public class LocationResponseDTO {
    public Document[] documents;

    @Data
    static class Document {
        public String address_name;
        public String x;
        public String y;

    }
}
