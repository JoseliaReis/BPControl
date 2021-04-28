package com.proto.EmergencyUnary;


import io.grpc.*;

import javax.jmdns.ServiceInfo;

public class ClientUnary {
    //main method
    public static void main(String[] args) {

        System.out.println("First Blood Pressure Check at 8:00am");
        //Will create functions to make sure that the client can be called
        ClientUnary main = new ClientUnary();
        main.run();
    }
    public void run(){
        ServiceInfo serviceInfo;
        String service_type = "_grpc._tcp.local.";
        //Now retrieve the service info - all we are supplying is the service type
        serviceInfo = ServiceDiscovery.run(service_type);
        //Use the serviceInfo to retrieve the port
        int port = serviceInfo.getPort();
        String host = "localhost";
        //int port = 50051;

        ManagedChannel channel = ManagedChannelBuilder.
                forAddress(host, port)
                .usePlaintext()
                .build();

        //we created this function to call the method or commented it out when is necessary
        doUnaryCall(channel);
       // doErrorhandling( channel);


        // Shutting down the channel
        System.out.println("Blood Pressure is under control. Patient does not need to be medicated. ");
        channel.shutdown();

    }
    private void doUnaryCall(ManagedChannel channel){

        //Create a EmergencyUnary service client (blocking sysnchronous)
        EmergencyServiceGrpc.EmergencyServiceBlockingStub emergencyClient = EmergencyServiceGrpc.newBlockingStub(channel);
        //Unary
        //creating a protocol buffer emergency message
        double number = 90.80;
        try {
            Emergency emergency = Emergency.newBuilder()
                    .setPatientFirstName("Ana")
                    .setPatientLastName("Reis")
                    .setAge(68)
                    .setAddress("Mountjoy Square")
                    .setHighBloodPressure(number )
                    .build();

            //creating a EmergencyUnary Request
            EmergencyRequest emergencyRequest = EmergencyRequest.newBuilder()
                    .setEmergency(emergency)
                    .build();
            //call the RPC and get back a emergency response (Protocol buffers)
            EmergencyResponse emergencyResponse = emergencyClient.emergency(emergencyRequest);
            System.out.println(emergencyResponse.getResult());

            System.out.println("Urinary Streaming Completed");
            System.out.println();


        }catch(RuntimeException e) {
            System.out.println(" Handling Exceptions");
            e.printStackTrace();



        }



    }
    private void doErrorhandling(ManagedChannel channel) {
        EmergencyServiceGrpc.EmergencyServiceBlockingStub blockingStub = EmergencyServiceGrpc.newBlockingStub(channel);
        String str = "Joselia";
        try {
            blockingStub.errorHandling(ErrorHandlingRequest.newBuilder()
                    .setPatientFirstName(str)
                    .build());

        }catch(StatusRuntimeException e) {
            System.out.println("Got an exception of First Name");
            e.printStackTrace();
        }

    }
}
