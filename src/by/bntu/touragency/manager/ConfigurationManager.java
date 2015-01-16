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
	//public static final String ERROR_PAGE_PATH = "ERROR_PAGE_PATH";
	public static final String LOGIN_PAGE_PATH = "LOGIN_PAGE_PATH";
	public static final String MAIN_PAGE_PATH = "MAIN_PAGE_PATH";
	public static final String CONFIRM_BOOK_PAGE_PATH = "CONFIRM_BOOK_PAGE_PATH";
	public static final String ERROR_PAGE_PATH = "ERROR_PAGE_PATH";
	public static final String SUCCESS_PAGE_PATH = "SUCCESS_PAGE_PATH";
	
	
	public static final String ORDERCAR_PAGE_PATH = "ORDERCAR_PAGE_PATH";
	public static final String CONFIRM_PAGE_PATH = "CONFIRM_PAGE_PATH";
	public static final String REFUSE_PAGE_PATH = "REFUSE_PAGE_PATH";
	public static final String REFUSEREASON_PAGE_PATH = "REFUSEREASON_PAGE_PATH";
	public static final String PERSONALINFO_PAGE_PATH = "PERSONALINFO_PAGE_PATH";
	public static final String RENTCARS_PAGE_PATH = "RENTCARS_PAGE_PATH";
	public static final String ADD_DAMAGE_PAGE_PATH = "ADD_DAMAGE_PAGE_PATH";
	public static final String RETURNCAR_PAGE_PATH = "RETURNCAR_PAGE_PATH";
	public static final String MYORDERS_PAGE_PATH = "MYORDERS_PAGE_PATH";
	public static final String USERORDERS_PAGE_PATH = "USERORDERS_PAGE_PATH";
	public static final String ALLORDERS_PAGE_PATH = "ALLORDERS_PAGE_PATH";
	
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