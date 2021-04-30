package com.proto.EmergencyServerClient;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.logging.Logger;

public class ServerClientServer extends ServerClientImpl {
    private static final Logger logger = Logger.getLogger(ServerClientServer.class.getName());

    public static void main(String[] args) {
        //create the object
        ServerClientServer server2 = new ServerClientServer();

        //registering the server with Jmdns
        int port = 50052;
        String service_type = "_grpc2._tcp.local.";
        String service_name = "GrpcServer2";
        //service registration object
        ServiceRegistration ssr2 = new ServiceRegistration();
        ssr2.run(port, service_type ,service_name);


        try {
            //create the server that has the port which was declared above
            Server server = ServerBuilder.forPort(port)
                    .addService(server2)
                    .build()
                    .start();
            System.out.println("\nServer 2 Started");

            server.awaitTermination();


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //will get the information and print out that the server has started
        logger.info("Server started, listening on " + port);


    }

}
