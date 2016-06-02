package by.bntu.touragency.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import by.bntu.touragency.command.Command;
import by.bntu.touragency.helper.RequestHelper;
import by.bntu.touragency.manager.ConfigurationManager;
import by.bntu.touragency.manager.MessageManager;

/**
 * Servlet implementation class Controller Controller of requests
 */
public class Controller extends HttpServlet implements javax.servlet.Servlet {

  private org.apache.log4j.Logger logger = Logger.getLogger(Controller.class);
  private static final long serialVersionUID = 1L;
  // object containing a list of available commands
  private RequestHelper requestHelper = RequestHelper.getInstance();

  /**
   * @see HttpServlet#HttpServlet()
   */
  public Controller() {
    super();
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
  }

  private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    String page = null;

    try {
      // determination of the command that came from the JSP
      Command command = requestHelper.getCommand(request);

      /*
       * a call to the method execute () from interface Command and passing
       * parameters to the class-specific command handler
       */
      page = command.execute(request, response);
      System.out.println(page);
      // method returns the response page
    } catch (ServletException e) {
      logger.error("Servlet Exception " + e);
      // generate an error message
      request.setAttribute("errorMessage", MessageManager.getInstance().getProperty(MessageManager.SERVLET_EXCEPTION_ERROR_MESSAGE));
      // call jsp-page with an error message
      page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.ERROR_PAGE_PATH);
    } catch (IOException e) {
      logger.error("IOException " + e);
      request.setAttribute("errorMessage", MessageManager.getInstance().getProperty(MessageManager.IO_EXCEPTION_ERROR_MESSAGE));
      page = ConfigurationManager.getInstance().getProperty(ConfigurationManager.ERROR_PAGE_PATH);
    }
    // call up page response to the request
    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
    dispatcher.forward(request, response);
  }
}
