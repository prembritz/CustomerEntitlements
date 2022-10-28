package com.nls.Enquiry;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name="ExportLCDetailsRequest",description="Request object with Unit Id and Reference Number")
@JsonbPropertyOrder({"proCode","unId","referenceNo"})
public class ExportLCDetailsRequest {

	@Schema(required =true , example="PRDT001" , description = "Product Code")
	@JsonbProperty("ProCode")
	public String proCode;
	
	@Schema(required =true , example="KE0010001" , description = "Unit ID")
	@JsonbProperty("UnitID")
	public String unId;
	
	@Schema(required =true , example="TF2120739247" , description = "Reference Number")
	@JsonbProperty("ReferenceNo")
	public String referenceNo;

}


