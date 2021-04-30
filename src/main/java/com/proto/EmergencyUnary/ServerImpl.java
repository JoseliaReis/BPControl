package com.proto.EmergencyUnary;


import io.grpc.Status;
import io.grpc.stub.StreamObserver;

//this extension will generate all code that will be used
public class ServerImpl extends EmergencyServiceGrpc.EmergencyServiceImplBase {
    //override method

    @Override
    public void emergency(EmergencyRequest request, StreamObserver<EmergencyResponse> responseObserver) {
        //The emergency takes an input, that is the EmergencyUnary Request and then sent to the response observer will resturn
        //extract the fields that we need in the response
        Emergency emergency = request.getEmergency();
        String PatientFirst_name = emergency.getPatientFirstName();
        String PatientLast_name = emergency.getPatientLastName();
        int age = emergency.getAge();
        String Address = emergency.getAddress();
        double  high_Blood_pressure = emergency.getHighBloodPressure();
        //create the response based on the fields that were extracted above
        String result = "\nThe actual blood Pressure Status for the follow patient is:"
                +"\nFirst Name:" +PatientFirst_name +
                " Last Name:" +PatientLast_name +
                " Age:" +age +
                " Address:" +Address +
                " Blood Pressure Status:" +high_Blood_pressure+ " mm/Hg";
        //generate the response
        EmergencyResponse response= EmergencyResponse.newBuilder()
                .setResult(result)
                .build();
        //the on next will send the emergency response to the client
        responseObserver.onNext(response);

        //complete the RPC call
        responseObserver.onCompleted();

    }
    //this error handling is a demonstration how it works in case of the input does not match with the conditions
    @Override
    public void errorHandling(ErrorHandlingRequest request, StreamObserver<ErrorHandlingResponse> responseObserver) {

        String str = request.getPatientFirstName();
        if (str.matches("[A-Za-z]+")) {
            responseObserver.onNext(
                    ErrorHandlingResponse.newBuilder()
                            .setResult(str)
                            .build());
            responseObserver.onCompleted();
        }else {
            responseObserver.onError(
                    Status.INVALID_ARGUMENT
                            .withDescription("The String sent must contain only Letters")
                            .asRuntimeException());
        }

    }

}






