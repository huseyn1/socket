
package com.soc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
    
    public static void main(String[] args) throws IOException {
        System.out.println("server is started");
        ServerSocket ss=new ServerSocket(9999);
        
        System.out.println("servre is waiting client request");
        Socket s=ss.accept();
        
        System.out.println("client Connected");
        
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        
        System.out.println("client data: "+str);
        
        
    }
    
}
