package com.proto.EmergencyBidirectionl;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ServiceRegistration {

    public void run(int port, String service_type, String service_name) {

        //get a jMDNS instance
        try {
            //create an instance with local host
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            /*
             * service information
             */

            //the assumption is that we are registering a grpc server

            int service_port = port;
            String service_desc = "Integration of jmDNS with gRPC";


            //Create ServiceInfo -
            //use the factory method to create the object
            ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_desc);

            /*
             * register the service
             */

            jmdns.registerService(serviceInfo);

            System.out.printf("Registering service with type: %s and name: %s on port %d ", service_type, service_name, service_port);

            //sleep for 10 seconds
            Thread.sleep(10000);
            System.out.println("\nService Registered");
            //unregister the services
            //jmdns.unregisterAllServices();   //you could also unregister a single service


        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
