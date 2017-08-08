package com.distributedsystem.client;
        import java.io.BufferedWriter;
        import java.io.OutputStream;
        import java.io.OutputStreamWriter;
        import java.net.InetAddress;
        import java.net.Socket;

class SampleClient implements Runnable
{
    private static Socket socket;

    public void run() {
        try
        {
            String host = "localhost";
            int port =25007 ;
            InetAddress address = InetAddress.getByName(host);
            socket = new Socket(address, port);
            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write("Hello client");
            bufferedWriter.flush();
            System.out.println("Message Sent to the Server");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

}


