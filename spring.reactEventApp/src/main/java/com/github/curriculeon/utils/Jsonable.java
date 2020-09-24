package com.github.curriculeon.utils;

/**
 * Created by leon on 7/10/2020.
 */
public interface Jsonable {
    default String asJsonString() {
        return Jsonifier.jsonify(this);
    }
}