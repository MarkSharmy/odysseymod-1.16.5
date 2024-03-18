package mod.arcalitegames.system.odyssey;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import net.minecraft.client.gui.widget.button.Button;

public class Machine
{
	public static void openBrowser(Button button)
	{
		String OS = System.getProperty("os.name").toLowerCase();

		if (OS.indexOf("win") >= 0) {

			try{

				Runtime rt = Runtime.getRuntime();
				String url = "https://www.patreon.com/arcalitegames";
				rt.exec("rundll32 url.dll,FileProtocolHandler " + url);

			}catch(IOException e)
			{
				System.out.println("Sorry still exception");
			}

		} else if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0) {

			try{

				Runtime rt = Runtime.getRuntime();
				String url = "https://www.patreon.com/arcalitegames";
				String[] browsers = { "google-chrome", "firefox", "mozilla", "epiphany", "konqueror",
						"netscape", "opera", "links", "lynx" };

				StringBuffer cmd = new StringBuffer();
				for (int i = 0; i < browsers.length; i++)
					if(i == 0)
						cmd.append(String.format(    "%s \"%s\"", browsers[i], url));
					else
						cmd.append(String.format(" || %s \"%s\"", browsers[i], url));
				// If the first didn't work, try the next browser and so on

				rt.exec(new String[] { "sh", "-c", cmd.toString() });

			}catch(IOException e)
			{
				System.out.println("Sorry still exception");
			}

		}else if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {

			try{

				Runtime rt = Runtime.getRuntime();
				String url = "https://www.patreon.com/arcalitegames";
				rt.exec("open " + url);

			}catch(IOException e)
			{
				System.out.println("Sorry still exception");
			}

		}
	}
	
	public static String getMachineUUID()
	{
		String UUID = "";
		
		try {
			
			UUID = InetAddress.getLocalHost().getHostName();
			
		}catch(UnknownHostException e)
		{
			e.printStackTrace();
		}catch(Exception g)
		{
			g.printStackTrace();
		}
		
		return UUID;
	}

	/*
	public static String getMachineUUID()
	{
		String OS = System.getProperty("os.name").toLowerCase();
		String machineId = null;
		
		if (OS.indexOf("win") >= 0) {
		    StringBuffer output = new StringBuffer();
		    Process process;
		    String[] cmd = {"wmic", "csproduct", "get", "UUID"};  
		    try {
		        process = Runtime.getRuntime().exec(cmd);
		        process.waitFor();
		        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		        String line = "";
		        while ((line = reader.readLine()) != null) {
		            output.append(line + "\n");
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    machineId = output.toString().substring(output.indexOf("\n"), output.length()).trim();;
		} else if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0) {

		    StringBuffer output = new StringBuffer();
		    Process process;
		    String[] cmd = {"/bin/sh", "-c", "echo <password for superuser> | sudo -S cat /sys/class/dmi/id/product_uuid"};
		    try {
		        process = Runtime.getRuntime().exec(cmd);
		        process.waitFor();
		        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		        String line = "";
		        while ((line = reader.readLine()) != null) {
		            output.append(line + "\n");
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
		    machineId = output.toString().substring(output.indexOf("\n"), output.length()).trim();;
		}else if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
			
			String command = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";

		    StringBuffer output = new StringBuffer();


		    try {
		    	
		    	Process SerNumProcess = Runtime.getRuntime().exec(command);

			    BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

			    String line = "";

			    while ((line = sNumReader.readLine()) != null) {
			        output.append(line + "\n");
			    }

			    machineId = output.toString().substring(output.indexOf("UUID: "), output.length()).replace("UUID: ", "");

			    SerNumProcess.waitFor();

			    sNumReader.close();
		    	
		    }catch(Exception e)
		    {
		    	e.printStackTrace();
		    }

		}
		
		return machineId;
	}
	*/
}
