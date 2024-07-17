package com.openclassrooms.tourguide.DTO;

import gpsUtil.location.Location;

public record NearByAttraction(String name, Location attractionLocation ,Location userLocation, Double distance, int reward) {
}
