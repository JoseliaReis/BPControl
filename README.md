#  Blood Pressure Control Project

Emergency Blood Pressure Control is a service that has scope to monitorate the blood pressure of patients that have higher risk of heart attack. 
- The services will work by doing the first check on the blood pressure and returning the patient information, the second one, will detect the blood pressure and indicate the medication and the last one, will work by showing up the treatment approach available. All services will work to detect blood alterations and give back the best response to save the patient’s life. 
- The services will communicate with each other by using Grpc, that is a framework for working with Remote Procedure Calls and works by using a protocol buf, which isthat is Interface Definition Language (IDL) used for describing the service interface and the structure of the data.
- The jmDNS will register and discover the devices, first one on the server and the other one on the client and remote error handling will be provided for remote invocation and user input validation. 
- To implement the project, three different devices were builded, each one with his respective proto, and they were executed using one client. 
- A simple GUI, graphical user interface, is available to invoke each service. 
