package t2;

import java.io.*;
import java.net.*;
public class SerSocket
{
public static void main(String args[])
{
	int port=1080;
	try
	{
	ServerSocket mySocket = new ServerSocket(port);
		System.out.println("Server initialized on port " + port);
		mySocket.getLocalPort();
		System.out.println(mySocket.getLocalPort());
		{
		while(true)
		mySocket.accept();
		}
		
}
catch (SocketException e)
{
		System.out.println("Socket error");
	}
catch ( IOException e)
	{
		System.out.println("An I/O Exception Occurred!");
	}
}
}
