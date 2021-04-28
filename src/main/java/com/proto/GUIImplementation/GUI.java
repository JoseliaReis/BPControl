package com.proto.GUIImplementation;


import com.proto.EmergencyBidirectionl.EmergencyMultiRequest;
import com.proto.EmergencyBidirectionl.EmergencyMultiResponse;
import com.proto.EmergencyBidirectionl.EmergencyServiceBidiGrpc;
import com.proto.EmergencyServerClient.EmergencyManyTimesRequest;
import com.proto.EmergencyServerClient.EmergencyServerClientGrpc;
import com.proto.EmergencyServerClient.LongEmergencyRequest;
import com.proto.EmergencyServerClient.LongEmergencyResponse;
import com.proto.EmergencyUnary.EmergencyRequest;
import com.proto.EmergencyUnary.EmergencyResponse;
import com.proto.EmergencyUnary.EmergencyServiceGrpc;
import com.proto.EmergencyUnary.ServiceDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.jmdns.ServiceInfo;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class GUI implements ActionListener{


    private JTextArea textResponse ;
    private JFrame frame;





    private JPanel getService1JPanel() {

        JPanel panel = new JPanel();
        JButton button = new JButton("Invoke Service 1");
        button.addActionListener(this);
        panel.add(button);
        return panel;

    }

    private JPanel getService2JPanel() {


        JPanel panel = new JPanel();
        JButton button = new JButton("Invoke Service 2");
        button.addActionListener(this);
        panel.add(button, BorderLayout.NORTH);



        return panel;


    }

    private JPanel getService3JPanel() {

        JPanel panel = new JPanel();
        JButton button = new JButton("Invoke Service 3");
        button.addActionListener(this);
        panel.add(button);
        return panel;


    }

    private JPanel getService4JPanel() {


        JPanel panel = new JPanel();
        JButton button = new JButton("Invoke Service 4");
        button.addActionListener(this);
        panel.add(button);
        return panel;


    }
    public static void main(String[] args) {

        GUI gui = new GUI();
        gui.build();

    }

    private void build() {
        //create the tittle
        JFrame frame = new JFrame("Blood Pressure Control App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the panel to add buttons
        JPanel panel = new JPanel();

        // Set the BoxLayout to be X_AXIS: from left to right
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.setLayout(boxlayout);

        // Set border for the panel
        panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
        //add the panels
        panel.add( getService1JPanel() );
        panel.add( getService2JPanel() );
        panel.add( getService3JPanel() );
        panel.add( getService4JPanel() );

        // Set size for the frame
        frame.setSize(300, 300);
        textResponse = new JTextArea(10, 40);
        textResponse .setLineWrap(true);
        textResponse.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textResponse);
        //textResponse.setSize(new Dimension(15, 30));
        panel.add(scrollPane);
        panel.setLayout(boxlayout);

        // Set the window to be visible as the default to be false
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }



    @Override
        public void actionPerformed(ActionEvent e) {
        JButton button = (JButton)e.getSource();
        String label = button.getActionCommand();
        /**
         * Invocation of Unary Server
         */
        if (label.equals("Invoke Service 1")) {
            System.out.println("service 1 to be invoked ...");
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
            EmergencyServiceGrpc.EmergencyServiceBlockingStub emergencyClient = EmergencyServiceGrpc.newBlockingStub(channel);

                    double number = 90.80;
                    com.proto.EmergencyUnary.Emergency emergency = com.proto.EmergencyUnary.Emergency.newBuilder()
                            .setPatientFirstName("Ana")
                            .setPatientLastName("Reis")
                            .setAge(68)
                            .setAddress("Mountjoy Square")
                            .setHighBloodPressure(number)
                            .build();

                    //creating a EmergencyUnary Request
                    EmergencyRequest emergencyRequest = EmergencyRequest.newBuilder()
                            .setEmergency(emergency)
                            .build();
                    //call the RPC and get back a emergency response (Protocol buffers)
                    EmergencyResponse emergencyResponse = emergencyClient.emergency(emergencyRequest);
                    textResponse.append(emergencyResponse.getResult());
                    System.out.println(emergencyResponse.getResult());

            /**
             * Invocation of Client Server
             */

        }else if (label.equals("Invoke Service 2")) {
            System.out.println("service 2 to be invoked ...");

            ServiceInfo serviceInfo2;
            //Retrieve the service info - all we are supplying is the service type
            String service_type2 = "_grpc2._tcp.local.";
            //Now retrieve the service info - all we are supplying is the service type
            serviceInfo2 = ServiceDiscovery.run(service_type2);
            //Use the serviceInfo to retrieve the port
            int port2 = serviceInfo2.getPort();
            String host2 = "localhost";
            //int port = 50052;
            //create the channel
            ManagedChannel channel1 = ManagedChannelBuilder.
                    forAddress(host2, port2)
                    .usePlaintext()
                    .build();

            EmergencyServerClientGrpc.EmergencyServerClientBlockingStub emergencyClient = EmergencyServerClientGrpc.newBlockingStub(channel1);
            //Server Streaming
            //Prepare the request

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
                            //this will append the result on the GUI
                             textResponse.append(emergencyManyTimesResponse.getResult());
                            System.out.println(emergencyManyTimesResponse.getResult());
                        });
            /**
             * Invocation of  Server Client
             */

        }else if  (label.equals("Invoke Service 3")) {
            System.out.println("service 2 to be invoked ...");
            //create the blocking stub
            ServiceInfo serviceInfo2;
            String service_type2 = "_grpc2._tcp.local.";
            serviceInfo2 = ServiceDiscovery.run(service_type2);
            int port2 = serviceInfo2.getPort();
            String host2 = "localhost";
            //int port = 50051;
            ManagedChannel channel1 = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();

            //create an asynchronous CLient
        EmergencyServerClientGrpc.EmergencyServerClientStub asyncClient = EmergencyServerClientGrpc.newStub(channel1);
        //CountDownLatch is used to make sure that a task waits for other threads before it starts.

            CountDownLatch latch = new CountDownLatch(1);
            StreamObserver<LongEmergencyRequest> requestObserver = asyncClient.longEmergency(new StreamObserver<LongEmergencyResponse>() {
                @Override
                public void onNext(LongEmergencyResponse value) {
                    //get a response from the Server
                    //On next will be called only once

                    System.out.println(value.getResult());
                    textResponse.append(value.getResult());

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
                    latch.countDown();//It will put the latch from number 1 to number 0
                }
            });
            //It will start to pass messages

            //Streaming message 1
            requestObserver.onNext(LongEmergencyRequest.newBuilder()
                    .setEmergency(com.proto.EmergencyServerClient.Emergency.newBuilder()
                            .setHighBloodPressure("200/80 mm Hg ")
                            .setMedication("Furosemide")
                            .build())
                    .build());



            //Tell the server that the client is done sending data
            requestObserver.onCompleted();

        /**
         * Invocation of Bi-Directional
         */


        }else if (label.equals("Invoke Service 4")){

            System.out.println("service 4 to be invoked ...");
            ServiceInfo serviceInfo3;
            String service_type3 = "_grpc3._tcp.local.";
            serviceInfo3 = ServiceDiscovery.run(service_type3);
            int port3 = serviceInfo3.getPort();
            String host3 = "localhost";
            //int port = 50051;

            ManagedChannel channel3 = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();


            //Create a Bidirectional service client (blocking sysnchronous)
            EmergencyServiceBidiGrpc.EmergencyServiceBidiStub asyncClient = EmergencyServiceBidiGrpc.newStub(channel3);
            //CountDownLatch is used to make sure that a task waits for other threads before it starts.
            CountDownLatch latch = new CountDownLatch(1);

                StreamObserver<EmergencyMultiRequest> requestObserver = asyncClient.emergencyMulti(new StreamObserver<EmergencyMultiResponse>() {

                    @Override
                    public void onNext(EmergencyMultiResponse value) {
                       textResponse.append(value.getResult());

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
                Arrays.asList("Intravenous (IV)"  ).forEach(
                        name ->{
                            System.out.println("Treatments approach");
                            System.out.println("Sending: " + name);
                            requestObserver.onNext(EmergencyMultiRequest.newBuilder()
                                    .setEmergency(com.proto.EmergencyBidirectionl.Emergency.newBuilder()
                                            .setHighBloodPressure(name)
                                            .setTreatment(name)
                                            .build())
                                    .build());

                            try {
                                Thread.sleep(100);

                            } catch (InterruptedException l) {
                                l.printStackTrace();
                            }
                        }

                );

                requestObserver.onCompleted();

                try {
                    latch.await(3L, TimeUnit.SECONDS);
                } catch (InterruptedException k) {
                    k.printStackTrace();
                }

        }

    }


}
