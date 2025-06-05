package com.example.acs.domain;

public class CallDetails {
    private String callerId;
    private String incomingCallContext;

    public CallDetails() {}

    public CallDetails(String callerId, String incomingCallContext) {
        this.callerId = callerId;
        this.incomingCallContext = incomingCallContext;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getIncomingCallContext() {
        return incomingCallContext;
    }

    public void setIncomingCallContext(String incomingCallContext) {
        this.incomingCallContext = incomingCallContext;
    }
}
