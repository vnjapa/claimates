package com.example.acs.service;

import com.azure.communication.callautomation.CallAutomationClient;
import com.azure.communication.callautomation.CallAutomationClientBuilder;
import com.azure.communication.callautomation.models.AnswerCallOptions;
import com.azure.communication.callautomation.models.PlayOptions;
import com.azure.communication.callautomation.models.TextSource;
import com.azure.communication.common.PhoneNumberIdentifier;
import org.springframework.stereotype.Service;

@Service
public class CallService {

    private final CallAutomationClient client;

    public CallService() {
        this.client = new CallAutomationClientBuilder()
                .connectionString("YOUR_ACS_CONNECTION_STRING")
                .buildClient();
    }

    public String answerCall(String incomingCallContext) {
        AnswerCallOptions options = new AnswerCallOptions(incomingCallContext, new PhoneNumberIdentifier("+YOUR_ACS_NUMBER"));
        return client.answerCall(options).getCallConnectionId();
    }

    public void playWelcomeMessage(String callConnectionId) {
        PlayOptions options = new PlayOptions(new TextSource("Hello, I am Smart Claim Advisor. How can I help you?"));
        client.getCallConnection(callConnectionId).play(options);
    }
}
