package com.lunchpick.lunchpick.controller;

import lombok.Data;

@Data
public class KaKaoResponseDTO {
    public Document[] documents;

    @Data
    public static class Document {
        public String address_name;
        public String category_group_code;
        public String category_group_name;
        public String category_name;
        public String distance;
        public String id;
        public String phone;
        public String place_name;
        public String place_url;
        public String road_address_name;
        public String x;
        public String y;
    }
}

