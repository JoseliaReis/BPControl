package com.proto.EmergencyUnary;
import io.grpc.ServerBuilder;
import java.io.IOException;
import java.util.logging.Logger;

public class ServerUnary extends ServerImpl {
    private static final Logger logger = Logger.getLogger(ServerUnary.class.getName());
    //It is the initial class for the
    public static void main(String[] args) {
        //create the object
        ServerUnary unary = new ServerUnary();

        //registering the server with Jmdns
        int port = 50051;
        String service_type = "_grpc._tcp.local.";
        String service_name = "GrpcServer";
        //service registration object
        ServiceRegistration ssr = new ServiceRegistration();
        //run the sever
        ssr.run(port, service_type, service_name);


        try {
            //create the server that has the port which was declared above
            io.grpc.Server server = ServerBuilder.forPort(port)
                    .addService(unary)
                    .build()
                    .start();
            System.out.println("\nServer 1 Started");

            server.awaitTermination();


        } catch (IOException e) {
            e.printStackTrace();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //will get the information and print out that the server has started
        logger.info("Server started, listening on " + port);
    }
}

