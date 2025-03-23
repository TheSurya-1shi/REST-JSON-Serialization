package com.in.akshay.binding;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketData {
	
	private String passName;
	private Integer passAge;
	private String passGender;
	private String sourceStation;
	private String destinationStation;
	private String date;
	private String tier;
	private String pnrNum;
	private Boolean isConfirmed;
	private Integer trainNumber;
	private Double totalTicket;
	

}
