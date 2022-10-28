package com.nls.Enquiry;

import java.util.List;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@JsonbPropertyOrder({ "ProCode", "summaryData" })
@Schema(name="DepositSummaryRequests",description="Request object with Unit Id and CifReference & Deposit AccountNumber")
public class DepositSummaryRequest {
	public static class DepositSummary{
		
		@Schema(required =true , example="KE0010001" , description = "Unit IdRef")
		@JsonbProperty("UnitID")
		public String unitId;
	
		@Schema(required =true , example="117234" , description = "Cif Reference")
		@JsonbProperty("CIF")
		public String cifRef;
	
		@Schema(required =true , example="1711460011" , description = "Deposit AccountNumber")
		@JsonbProperty("DepositAccountNo")
		public String depositAccNo;
		
	}
	
	@Schema(required =true , example="PRDT005" , description = "Pro Code")
	@JsonbProperty("ProcCode")
	public String proCode;

	
	@JsonbProperty("AcctData")
	public List<DepositSummary> summaryData;
}
