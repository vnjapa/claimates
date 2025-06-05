package com.example.acs.controller;

import com.example.acs.domain.CallDetails;
import com.example.acs.service.CallService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/incoming-call")
public class IncomingCallController {

    private final CallService callService;

    public IncomingCallController(CallService callService) {
        this.callService = callService;
    }

    @PostMapping
    public ResponseEntity<String> handleIncomingCall(@RequestBody CallDetails callDetails) {
        String callConnectionId = callService.answerCall(callDetails.getIncomingCallContext());
        callService.playWelcomeMessage(callConnectionId);
        return ResponseEntity.ok("Call handled successfully");
    }
}
