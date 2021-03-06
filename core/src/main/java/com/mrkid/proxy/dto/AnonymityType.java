package com.mrkid.proxy.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

/**
 * User: xudong
 * Date: 02/12/2016
 * Time: 8:45 AM
 */


public enum AnonymityType {
    UNKNOWN(0),
    TRANSPARENT_PROXY(1),
    ANONYMOUS_PROXY(2),
    DISTORTING_PROXY(3),
    HIGH_ANONYMITY_PROXY(4);

    private int key;

    AnonymityType(int key) {
        this.key = key;
    }


    @JsonValue
    public int getKey() {
        return key;
    }

    @JsonCreator
    public static AnonymityType create(int i) {
        return Arrays.stream(AnonymityType.values()).filter(t -> t.key == i).findFirst().orElseGet(() ->
                UNKNOWN);
    }
}
