package com.proto.EmergencyServerClient;


import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class ServerClientImpl extends EmergencyServerClientGrpc .EmergencyServerClientImplBase {


   //override method
   //To implement Server Streaming
   @Override
    public void emergencyManyTimes(EmergencyManyTimesRequest request, StreamObserver<EmergencyManyTimesResponse> responseObserver) {
        //generate the request
    	String PatientFirst_name = request.getEmergency().getPatientFirstName();
        String PatientLast_name = request.getEmergency().getPatientLastName();
        int age = request.getEmergency().getAge();
        String Address = request.getEmergency().getAddress();
       
        try{ //the entire block bellow
            for(int i = 0; i<1; i++){
            	//generate the response
                String result = "\nChecking Blood Pressure Status for the Patient: " + PatientFirst_name
                		+ PatientLast_name +
                       " Age: " + age +
                       " Address:  " + Address;
                //create the Emergency Many Times Response and set the results
                EmergencyManyTimesResponse response = EmergencyManyTimesResponse.newBuilder()
                        .setResult(result)
                        .build();
                //Send the response to the response observer back to the client
                responseObserver.onNext(response); //the response will be send back to the client;
                Thread.sleep(1000L); //Here is the time that will be taken by each one of the times that the request will be printed
        }
      }catch (InterruptedException e){
            e.printStackTrace();
        }finally { //every time that the thread gets interrupted, will be printed the stack trace and call the on completed
            responseObserver.onCompleted(); //the request is completed
        }

    }
    //override method
    //Client Streaming
    @Override
    //It will return the stream observer because is sync and the client will send many message to the server and
    //and it will need to return
    public StreamObserver<LongEmergencyRequest> longEmergency(StreamObserver<LongEmergencyResponse> responseObserver) {
        StreamObserver<LongEmergencyRequest> requestObserver = new StreamObserver<LongEmergencyRequest>() {
           String  result = "";
            @Override
            public void onNext(LongEmergencyRequest value) {
            //client sends a message
                //Results will increase the result string
                result +="\nBlood Pressure Status: " +value.getEmergency().getHighBloodPressure()+
                		"\nRecommended Medication  : "+ value.getEmergency().getMedication();
            }

            @Override
            public void onError(Throwable t) {
                //client sends an error

            }

            @Override
            //client is done
            public void onCompleted() {
                //it is when we want to return a response (responseObserver)
                responseObserver.onNext(
                        LongEmergencyResponse.newBuilder()
                        .setResult(result)
                        .build()
                );
                        responseObserver.onCompleted();
            }
        };
        return requestObserver; //It is returning a String

    }

}
