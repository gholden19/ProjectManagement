package speromeliora.http;

public class GetProjectRequest {
	String arg1;

	public String getArg1() { return arg1; }
	public void setArg1(String arg1) { this.arg1 = arg1; }

	public String toString() {
		return "GetProject(" + arg1 + ")";
	}
	
	public GetProjectRequest (String arg1) {
		this.arg1 = arg1;
	}
	
	public GetProjectRequest() {
	}
}
