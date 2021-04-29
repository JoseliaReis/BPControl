package com.proto.EmergencyBidirectionl;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class ServerBidiImpl extends EmergencyServiceBidiGrpc.EmergencyServiceBidiImplBase {

    //override method
    @Override
    public StreamObserver<EmergencyMultiRequest> emergencyMulti(StreamObserver<EmergencyMultiResponse> responseObserver) {
        StreamObserver<EmergencyMultiRequest> requestObserver = new StreamObserver<EmergencyMultiRequest>  () {

            @Override
            public void onNext(EmergencyMultiRequest value) {
                String response = "Hypertensive emergency. Risk of heart attack. What are the treatment available?? "+ value.getEmergency().getTreatment();
                EmergencyMultiResponse emergencyMultiResponse = EmergencyMultiResponse.newBuilder()
                        .setResult(response)
                        .build();
                responseObserver.onNext(emergencyMultiResponse);

            }


            @Override
            public void onError(Throwable t) {
                //client sends an error

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }

        };
        return requestObserver;
    }

}