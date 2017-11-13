
package com.soc;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
    
    public static void main(String[] args) throws IOException {
        
        String ip="localhost";
        int port=9999;
        Socket s =new Socket(ip,port);
        
        String str="Huseyn Huseyn";
        
        OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
        PrintWriter out=new PrintWriter(os);
        out.write(str);
        out.flush();
        
    }
    
}
