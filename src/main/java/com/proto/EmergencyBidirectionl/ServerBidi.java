package com.proto.EmergencyBidirectionl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class ServerBidi  extends ServerBidiImpl {
    private static final Logger logger = Logger.getLogger(ServerBidi.class.getName());

    public static void main(String[] args) {

        ServerBidi greeterserver = new ServerBidi();

        int port = 50053;
        String service_type = "_grpc3._tcp.local.";
        String service_name = "GrpcServer3";
        ServiceRegistration ssr3 = new ServiceRegistration();
        ssr3.run(port, service_type ,service_name);


        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(greeterserver)
                    .build()
                    .start();
            System.out.println("\nServer 3 Started");

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

