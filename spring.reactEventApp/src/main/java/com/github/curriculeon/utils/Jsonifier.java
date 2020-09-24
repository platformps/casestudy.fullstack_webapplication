package com.github.curriculeon.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonifier {
    public static String jsonify(Object jsonable) {
        try {
            return new ObjectMapper().writeValueAsString(jsonable);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
