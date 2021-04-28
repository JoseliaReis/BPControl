package com.proto.EmergencyServerClient;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class ServerClientServer extends ServerClientImpl {
    private static final Logger logger = Logger.getLogger(ServerClientServer.class.getName());

    public static void main(String[] args) {

        ServerClientServer greeterserver = new ServerClientServer();

        int port = 50052;
        String service_type = "_grpc2._tcp.local.";
        String service_name = "GrpcServer2";
        ServiceRegistration ssr2 = new ServiceRegistration();
        ssr2.run(port, service_type ,service_name);


        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(greeterserver)
                    .build()
                    .start();
            System.out.println("\nServer V1.2 Started");

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
