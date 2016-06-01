package by.bntu.touragency.command;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import by.bntu.touragency.manager.ConfigurationManager;

public class MainCommand implements Command {

  private static org.apache.log4j.Logger logger = Logger.getLogger(MainCommand.class);

  @Override
  public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String page = null;

    try {

      page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.MAIN_PAGE_PATH);
    } catch (Exception e) {
      logger.error("Logic Technical Exception" + e);
    }

    return page;
  }

}