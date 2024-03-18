package mod.arcalitegames.system.ai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.google.common.collect.Lists;

public class CitizenParser 
{	
	File file;
	String fileName;
	String entityName;
	String path = "C:\\Users\\Wilmac\\Documents\\Minecraft\\Entities\\";
	List<String> occupiedNames = Lists.newArrayList();
	List<String> availableNames = Lists.newArrayList();
	
	public CitizenParser(String name)
	{
		fileName = path + name + ".txt";
		file = new File(fileName);
		
		Scanner scanner;
		try {
			
			scanner = new Scanner(file);
			
			while(scanner.hasNextLine())
			{
				String str = scanner.nextLine();
				this.availableNames.add(str);
			}
			
			scanner.close();
			System.out.println("Number of occupants: " + availableNames.size());
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public  String getEntityName()
	{
		this.setEntityName();
		return entityName;
	}
	
	public void setEntityName()
	{
		int index = new Random().nextInt(availableNames.size());
		
		entityName = availableNames.get(index);
		
		if(nameOccupied(entityName))
			this.attemptAlternative();
		else
			occupiedNames.add(entityName);
	}
	
	public void attemptAlternative()
	{
		int index = new Random().nextInt(availableNames.size());
		
		entityName = availableNames.get(index);
		
		if(nameOccupied(entityName))
			this.setEntityName();
		else
			occupiedNames.add(entityName);
	}
	
	private  boolean nameOccupied(String testName)
	{
		for(String name: occupiedNames)
		{
			if(name.equals(testName))
				return true;
		}
		
		return false;
	}
	
}
