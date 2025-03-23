package com.in.akshay.binding;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PassangerData {
	
	private String passName;
	private Integer passAge;
	private String passGender;
	private String sourceStation;
	private String destinationStation;
	private String date;
	private String tier;

}
