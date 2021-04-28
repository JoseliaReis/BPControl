package com.proto.EmergencyUnary;


import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class ServerUnary extends ServerImpl {
    private static final Logger logger = Logger.getLogger(ServerUnary.class.getName());

    public static void main(String[] args) {

        ServerUnary unary = new ServerUnary();

        int port = 50051;
        String service_type = "_grpc._tcp.local.";
        String service_name = "GrpcServer";
        ServiceRegistration ssr = new ServiceRegistration();
        ssr.run(port, service_type, service_name);


        try {
            io.grpc.Server server = ServerBuilder.forPort(port)
                    .addService(unary)
                    .build()
                    .start();
            System.out.println("\nServer 1 Started");

            server.awaitTermination();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        logger.info("Server started, listening on " + port);


    }
}

