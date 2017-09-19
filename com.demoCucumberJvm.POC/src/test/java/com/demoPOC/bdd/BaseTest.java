package com.demoPOC.bdd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import com.demoPOC.helpers.Utils;

public class BaseTest extends Utils {

	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;
	public String className;

	public void init() throws IOException {

		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"), Repository.getProperty("runMode"));
		driver.get(Repository.getProperty("url"));

	}

	public void loadPropertiesFile() throws IOException {
		f = new File("./Configuration/Config.properties");
		FI = new FileInputStream(f);
		Repository.load(FI);

	}

	// Get the IE Driver Path
	public static String getIEPath() {
		String iepath = Repository.getProperty("iepath");
		return iepath;
	}

	// Get the Firefox Path
	public static String getFirefoxPath() {
		String firefoxpath = Repository.getProperty("firefoxpath");
		return firefoxpath;
	}

	// Get the Chrome Path
	public static String getChromePath() {
		String chromepath = Repository.getProperty("chromepath");
		return chromepath;
	}

}
