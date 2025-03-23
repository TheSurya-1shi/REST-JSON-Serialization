package com.in.akshay.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in.akshay.binding.PassangerData;
import com.in.akshay.binding.TicketData;

@RestController
public class TicketBookingRestController {
	
	@PostMapping(value="/bookTicket",
				produces= {"application/json"},
				consumes= {"application/json"}) // produces and consumes is not required if we are not using XML as input or output
	// because by default spring boot uses JSON as input and output.
	public ResponseEntity<TicketData> bookTicket(@RequestBody PassangerData passangerData) {

		TicketData ticketData = new TicketData(passangerData.getPassName(), passangerData.getPassAge(),
				passangerData.getPassGender(), passangerData.getSourceStation(), passangerData.getDestinationStation(),
				passangerData.getDate(),passangerData.getTier(), null, true, 16594, 1900.00);
		
		UUID randomUUID = UUID.randomUUID();
		String pnr = randomUUID.toString();
		ticketData.setPnrNum(pnr);

		return new ResponseEntity<TicketData>(ticketData, HttpStatus.CREATED);
	}

}
