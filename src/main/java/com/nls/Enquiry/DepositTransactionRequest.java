package com.nls.Enquiry;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@JsonbPropertyOrder({ "proCode", "unitId","depositAccountno","fromDate","toDate"})
@Schema(name = "DepositTransactionRequest", description = "Request object with ProCode,Unit Id ,Reference Number,Deposit AccountNumber,From Date and To Date")
public class DepositTransactionRequest {

	@Schema(required = true, example = "PRDT004", description = "Pro Code")
	@JsonbProperty("ProCode")
	public String proCode;

	@Schema(required = true, example = "KE0010001", description = "Unit Id")
	@JsonbProperty("UnitID")
	public String unitId;

	@Schema(required = true, example = "7519350046", description = "Deposit AccountNumber")
	@JsonbProperty("DepositAccountNo")
	public String depositAccountno;

	@Schema(required = true, example = "12032021", description = "From Date")
	@JsonbProperty("FromDate")
	public String fromDate;

	@Schema(required = true, example = "04062022", description = "To Date")
	@JsonbProperty("ToDate")
	public String toDate;

}
