package https.paysecure.merchant_soap;

import https.paysecure.merchant.CallPaySecure;
import https.paysecure.merchant.CallPaySecureResponse;

public class IssuerWebServiceSoapImpl implements IssuerWebServiceSoap {

	@Override
	public String versionInfo() {
		String v = "1.0.0";
		return v;
	}

	@Override
	public CallPaySecureResponse callPaySecure(RequestorCredentials requestorCredentials, CallPaySecure parameters) {
		
		System.out.println("Creds :: "+requestorCredentials);
		System.out.println("Params :: "+parameters);
		
		CallPaySecureResponse response = new CallPaySecureResponse();
		response.setCallPaySecureResult("Success");
		return response;
	}

}
