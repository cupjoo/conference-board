package com.example.springrestapi.event;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Builder
public class EventDto {
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location;
    private int basePrice;
    private int maxPrice;
    private int limitOfEnrollment;

    public Event toEntity(){
        return Event.builder()
                .name(name)
                .description(description)
                .beginEnrollmentDateTime(beginEnrollmentDateTime)
                .closeEnrollmentDateTime(closeEnrollmentDateTime)
                .beginEventDateTime(beginEventDateTime)
                .endEventDateTime(endEventDateTime)
                .location(location)
                .basePrice(basePrice)
                .maxPrice(maxPrice)
                .limitOfEnrollment(limitOfEnrollment).build();
    }
}
