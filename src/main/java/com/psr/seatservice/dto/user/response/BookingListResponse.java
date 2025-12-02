package com.psr.seatservice.dto.user.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingListResponse {
    private String programName;
    private String viewingDate;
    private String viewingTime;
    private String bookingUuid;
    private String status;
    private String programType;

    public BookingListResponse(String programName, String viewingDate, String viewingTime, String bookingUuid, String status, String programType) {
        this.programName = programName;
        this.viewingDate = viewingDate;
        this.viewingTime = viewingTime;
        this.bookingUuid = bookingUuid;
        this.status = status;
        this.programType = programType;
    }
}
