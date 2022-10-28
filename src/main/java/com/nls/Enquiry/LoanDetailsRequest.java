package com.nls.Enquiry;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name="LoanDetailsRequest",description="Request object with Unit Id,Account Number")
@JsonbPropertyOrder({"proCode","unId","loanAccnumber"})
public class LoanDetailsRequest {

	@Schema(required =true , example="PRDT001" , description = "Product Code")
	@JsonbProperty("ProcCode")
	public String proCode;
	
	@Schema(required =true , example="KE0010001" , description = "Unit ID")
	@JsonbProperty("UnitID")
	public String unId;
	
	@Schema(required =true , example="1711630011" , description = "Account Number")
	@JsonbProperty("LoanAccountNo")
	public String loanAccnumber;

}


