package com.mystation.mystation;

public record Station(
        Integer id,
        String name,
        Integer maxPower,
        String vendor,
        Boolean configured,
        StationStatus status,
        Integer owner
) {
}