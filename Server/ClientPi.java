package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ClientPi 
{
	public static void main(String[] args) 
	{
		Runtime runtime = Runtime.getRuntime();
		Process proc = runtime.exec("sudo screen /dev/ttyUSB0 338400");
		System.out.println("Shutdown called\n");
		System.exit(0);
	}
}
