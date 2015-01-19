package by.bntu.touragency.manager;

import java.util.ResourceBundle;

/**
 * A utility class that retrieves from the property file necessary information
 * for the functioning of the application command
 */
public class ConfigurationManager {

	private static ConfigurationManager instance;
	private ResourceBundle resourceBundle;
	
	// class retrieves information from a config.properties
	private static final String BUNDLE_NAME = "resource/config";
	public static final String DATABASE_DRIVER_NAME = "DATABASE_DRIVER_NAME";
	public static final String DATABASE_URL = "DATABASE_URL";
	public static final String LOGIN_PAGE_PATH = "LOGIN_PAGE_PATH";
	public static final String MAIN_PAGE_PATH = "MAIN_PAGE_PATH";
	public static final String CONFIRM_BOOK_PAGE_PATH = "CONFIRM_BOOK_PAGE_PATH";
	public static final String ERROR_PAGE_PATH = "ERROR_PAGE_PATH";
	public static final String SUCCESS_PAGE_PATH = "SUCCESS_PAGE_PATH";
	public static final String MY_TOURS_PAGE_PATH = "MY_TOURS_PAGE_PATH";
	public static final String ALL_USERS_PAGE_PATH = "ALL_USERS_PAGE_PATH";
	public static final String ADD_USER_PAGE_PATH = "ADD_USER_PAGE_PATH";
	
	public static ConfigurationManager getInstance() {
		if (instance == null) {
			instance = new ConfigurationManager();
			instance.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
		}
		return instance;
	}
	
	public String getProperty(String key) {
		return (String)resourceBundle.getObject(key);
	}
}