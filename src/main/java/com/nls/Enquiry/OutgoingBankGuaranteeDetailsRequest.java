package com.nls.Enquiry;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name="OutgoingBankGuaranteeDetailsRequest",description="Request object with Unit Id and Reference No")
@JsonbPropertyOrder({"proCode","unId","referenceNo"})
public class OutgoingBankGuaranteeDetailsRequest {

	@Schema(required =true , example="PRDT001" , description = "Product Code")
	@JsonbProperty("ProCode")
	public String proCode;
	
	@Schema(required =true , example="KE0010001" , description = "Unit ID")
	@JsonbProperty("UnitID")
	public String unId;
	
	@Schema(required =true , example="MD1027800006" , description = "Reference No")
	@JsonbProperty("ReferenceNo")
	public String referenceNo;

}


