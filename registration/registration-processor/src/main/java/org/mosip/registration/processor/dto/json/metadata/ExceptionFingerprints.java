package org.mosip.registration.processor.dto.json.metadata;

import lombok.Data;

@Data
public class ExceptionFingerprints {
	
	private String missingFinger;
	private String exceptionDescription;
	private String exceptionType;
	
}