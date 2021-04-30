package com.proto.EmergencyBidirectionl;

import io.grpc.stub.StreamObserver;

public class ServerBidiImpl extends EmergencyServiceBidiGrpc.EmergencyServiceBidiImplBase {

    //override method
    //the response observer will be called many many times
    @Override
    public StreamObserver<EmergencyMultiRequest> emergencyMulti(StreamObserver<EmergencyMultiResponse> responseObserver) {
       //Stream observer to implement all methods
        StreamObserver<EmergencyMultiRequest> requestObserver = new StreamObserver<EmergencyMultiRequest>  () {

            @Override
            //Every time that the emergency multi request is received, the emergency multi response will me returned
            public void onNext(EmergencyMultiRequest value) {
                String response = "Hypertensive emergency. Risk of heart attack. What is the treatment available?? "+ value.getEmergency().getTreatment();
                EmergencyMultiResponse emergencyMultiResponse = EmergencyMultiResponse.newBuilder()
                        .setResult(response)
                        .build();
                //send the message back to the response observer
                responseObserver.onNext(emergencyMultiResponse);

            }


            @Override
            public void onError(Throwable t) {
                //client sends an error

            }

            @Override
            public void onCompleted() {
                //the client is done send the message
                responseObserver.onCompleted();
            }

        };
        return requestObserver;
    }

}