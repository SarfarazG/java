package t2;

import java.io.*;
import java.net.*;
public class ExSocket {
	public static void main(String args[]) throws UnknownHostException
	{
		try 
		{
			Socket mySocket = new Socket("www.my-site.com",80);
			System.out.println("Connection to: " + mySocket.getInetAddress());
			System.out.println("Port Number: " + mySocket.getPort());
			System.out.println("Local Address: " + mySocket.getLocalAddress());
			System.out.println("Local Port: " + mySocket.getLocalPort());
		}
		catch (UnknownHostException e)
		{
			System.out.println("Site not found!");
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
