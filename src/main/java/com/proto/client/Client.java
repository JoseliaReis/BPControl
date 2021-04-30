package com.proto.client;


import com.proto.EmergencyUnary.*;
import com.proto.EmergencyUnary.ServiceDiscovery;

import com.proto.EmergencyBidirectionl.EmergencyMultiRequest;
import com.proto.EmergencyBidirectionl.EmergencyMultiResponse;
import com.proto.EmergencyBidirectionl.EmergencyServiceBidiGrpc;
import com.proto.EmergencyServerClient.EmergencyManyTimesRequest;
import com.proto.EmergencyServerClient.EmergencyServerClientGrpc;
import com.proto.EmergencyServerClient.LongEmergencyRequest;
import com.proto.EmergencyServerClient.LongEmergencyResponse;
import io.grpc.*;
import io.grpc.stub.StreamObserver;
import javax.jmdns.ServiceInfo;
import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Client {
    //main method
    public static void main(String[] args) {
        System.out.println("Emergency Blood Pressure Control Starting: ");
        //Will create functions to make sure that the client can be called
        Client main = new Client();
        //call the run function
        main.run();
    }
    //run function
    private void run(){
        /**
         * Discovery and Register the Unary Service
         */
        //This channel will be the transport to find the LocalHost
        ServiceInfo serviceInfo;
        String service_type = "_grpc._tcp.local.";
        //Now retrieve the service info - all we are supplying is the service type
        serviceInfo = ServiceDiscovery.run(service_type);
        //Use the serviceInfo to retrieve the port
        int port = serviceInfo.getPort();
        //int port = 50051;
        String host = "localhost";
        //create the managed channel to transport
        ManagedChannel channel = ManagedChannelBuilder.
                forAddress(host, port)
                .usePlaintext()
                .build();
        //function to call the method unary
        System.out.println("\nUnary Streaming service starting:");
        doUnaryCall(channel);
        //doErrorhandling( channel);


        /**
         * Discovery and Register the Server Streaming and the Client Streaming
         */
        ServiceInfo serviceInfo2;
        String service_type2 = "_grpc2._tcp.local.";
        serviceInfo2 = ServiceDiscovery.run(service_type2);
        int port2 = serviceInfo2.getPort();
        String host2 = "localhost";
        //int port = 50052;

        ManagedChannel channel1 = ManagedChannelBuilder.
                forAddress(host2, port2)
                .usePlaintext()
                .build();
        System.out.println("\nServer and CLient Streaming starting:");

        //Call the Method
        doServerStreamingCall(channel1);
        doCLientStreamingCall(channel1);
        /**
         * Discovery and Register the Bi-Directional Streaming
         */
        ServiceInfo serviceInfo3;
        String service_type3 = "_grpc3._tcp.local.";
        serviceInfo3 = ServiceDiscovery.run(service_type3);
        int port3 = serviceInfo3.getPort();
        String host3 = "localhost";
        //int port = 50053;

        ManagedChannel channel3 = ManagedChannelBuilder.
                forAddress(host3, port3)
                .usePlaintext()
                .build();
        System.out.println("\nBi-Directional Streaming starting:");
        System.out.println("\n");
        //Call the method
        doBiDiStreamingCall(channel3);



        // Shutting down the channel
        System.out.println("\nShutting down channel. Emergency Blood Pressure Control completed:");
        channel1.shutdown();

    }
    //Unary RPC
    private void doUnaryCall(ManagedChannel channel){

        //Create a EmergencyUnary service client (blocking sysnchronous) and pass the channel
        EmergencyServiceGrpc.EmergencyServiceBlockingStub emergencyClient = EmergencyServiceGrpc.newBlockingStub(channel);
        //Unary
        //creating a protocol buffer emergency message
        double number = 90.80;
        try {
            com.proto.EmergencyUnary.Emergency emergency = com.proto.EmergencyUnary.Emergency.newBuilder()
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
        //create a blocking stub
        EmergencyServiceGrpc.EmergencyServiceBlockingStub blockingStub = EmergencyServiceGrpc.newBlockingStub(channel);
        //set the string

        //Validation to check if the input match with the condition
        String str =  JOptionPane.showInputDialog(null, "Please enter Patient Name: ");
        //check if matches with the condition
        try {
            blockingStub.errorHandling(ErrorHandlingRequest.newBuilder()
                    .setPatientFirstName(str)
                    .build());

        }catch(StatusRuntimeException e) {
            // if does not match, print out the exception
            System.out.println("Got an exception of First Name");
            e.printStackTrace();
        }

    }

    /**
     * Server Streaming RPC
     */
    private  void doServerStreamingCall(ManagedChannel channel1){
        //create the blocking stub
        EmergencyServerClientGrpc.EmergencyServerClientBlockingStub emergencyClient = EmergencyServerClientGrpc.newBlockingStub(channel1);
        //Server Streaming
        //Prepare the request
        try{
            EmergencyManyTimesRequest emergencyManyTimesRequest =
                    EmergencyManyTimesRequest.newBuilder()
                            .setEmergency(com.proto.EmergencyServerClient.Emergency.newBuilder()
                                    .setPatientFirstName("Ana ")
                                    .setPatientLastName("Martins ")
                                    .setAge(68)
                                    .setAddress("Mountjoy Square West, 55 "))
                            .build();
            // Stream the responses (in a blocking manner)
            emergencyClient.emergencyManyTimes(emergencyManyTimesRequest)
                    //java function
                    .forEachRemaining(emergencyManyTimesResponse -> {
                        //it will print out the result
                        System.out.println(emergencyManyTimesResponse.getResult());
                    });

        }catch(RuntimeException e) {
            System.out.println(" Handling Exceptions");
            e.printStackTrace();

        }

    }
    //Client Streaming RPC
    private void doCLientStreamingCall(ManagedChannel channel1) {
        //create an asynchronous CLient
        EmergencyServerClientGrpc.EmergencyServerClientStub asyncClient = EmergencyServerClientGrpc.newStub(channel1);
        //CountDownLatch is used to make sure that a task waits for other threads before it starts.
        try{
            CountDownLatch latch = new CountDownLatch(1);
            StreamObserver<LongEmergencyRequest> requestObserver = asyncClient.longEmergency(new StreamObserver<LongEmergencyResponse>() {
                @Override
                public void onNext(LongEmergencyResponse value) {
                    //get a response from the Server
                    //On next will be called only once
                    System.out.println(value.getResult());
                    // onNext will be called only once

                }

                @Override
                public void onError(Throwable t) {
                    //get an error from the Server

                }

                @Override
                public void onCompleted() {
                    //The server is completed sending the data
                    //onCompleted will be called after onNext()
                    System.out.println("High Blood Pressure was detected. Patient is under medication.");
                    latch.countDown();//It will put the latch from number 1 to number 0
                }
            });
            //It will start to pass messages

            //Streaming First message
            requestObserver.onNext(LongEmergencyRequest.newBuilder()
                    .setEmergency(com.proto.EmergencyServerClient.Emergency.newBuilder()
                            .setHighBloodPressure("200/80 mm Hg ")
                            .setMedication("Furosemide")
                            .build())
                    .build());
            //Streaming Second message
            requestObserver.onNext(LongEmergencyRequest.newBuilder()
                    .setEmergency(com.proto.EmergencyServerClient.Emergency.newBuilder()
                            .setHighBloodPressure("220/80 mm Hg ")
                            .setMedication("Bumetanide ")
                            .build())
                    .build());


            //Tell the server that the client is done sending data
            requestObserver.onCompleted();

            try {
                latch.await(5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }catch(RuntimeException e) {
            System.out.println("Handling Exceptions");
            e.printStackTrace();
        }
    }
    //Bidirectional Streaming RPC
    private void doBiDiStreamingCall(ManagedChannel channel3) {
        //create an asynchronous CLientservice
        EmergencyServiceBidiGrpc.EmergencyServiceBidiStub asyncClient = EmergencyServiceBidiGrpc.newStub(channel3);
        //CountDownLatch is used to make sure that a task waits for other threads before it starts.
        CountDownLatch latch = new CountDownLatch(1);
        try {
            StreamObserver<EmergencyMultiRequest> requestObserver = asyncClient.emergencyMulti(new StreamObserver<EmergencyMultiResponse>() {

                @Override
                public void onNext(EmergencyMultiResponse value) {
                    //every time that a response from the server is received, it will be print out
                    System.out.println("Response from server: " + value.getResult());
                }

                @Override
                public void onError(Throwable t) {
                    latch.countDown();

                }

                @Override
                public void onCompleted() {

                    latch.countDown();
                }
            });
            //create an array list with treatment available
            Arrays.asList("Intravenous (IV)" , "labetalol", "nonselective beta-adrenergic" ).forEach(
                    name ->{
                        System.out.println("Sending: " + name);
                        requestObserver.onNext(EmergencyMultiRequest.newBuilder()
                                //set the blood pressure and the treatment
                                .setEmergency(com.proto.EmergencyBidirectionl.Emergency.newBuilder()
                                        .setHighBloodPressure(name)
                                        .setTreatment(name)
                                        .build())
                                .build());

                        try {
                            Thread.sleep(100);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

            );

            requestObserver.onCompleted();

            try {
                latch.await(3L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }catch(RuntimeException e) {
            System.out.println(" Handling Exceptions");
            e.printStackTrace();

        }
    }
}
