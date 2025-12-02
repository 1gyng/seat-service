package com.psr.seatservice.dto.program.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BizProgramScheduleResponse {
    private Long programNum;
    private String viewingDate;
    private String viewingTime;
    @JsonProperty("peopleNum")
    private long currentParticipants;

    public BizProgramScheduleResponse(Long programNum, String viewingDate, String viewingTime, long currentParticipants) {
        this.programNum = programNum;
        this.viewingDate = viewingDate;
        this.viewingTime = viewingTime;
        this.currentParticipants = currentParticipants;
    }
}
