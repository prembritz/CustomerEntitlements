package com.nls.Enquiry;

import java.util.List;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@JsonbPropertyOrder({ "procode", "creditData" })
@Schema(name = "CreditFacilitySummaryRequest", description = "Request object with Unit Id,Prodcode & CIF")
public class CreditFacilitySummaryRequest {

	@JsonbProperty("ProCode")
	@Schema(required = true, example = "AAA4343434", description = "ProCode")
	public String procode;
	
	public static class CreditFacility{
		@Schema(required =true , example="KE0010001" , description = "UnitID")
		@JsonbProperty("UnitID")
		public String unitId;
		
		@Schema(required =true , example="15454" , description = "CIF")
		@JsonbProperty("CIF")
		public String cif;
		
	}
	
	@JsonbProperty("CreditFaclitySummaryData")
	public List<CreditFacility> creditData;
	
	

}
