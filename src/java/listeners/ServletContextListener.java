/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import java.util.HashMap;
import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpSession;

/**
 * Web application lifecycle listener.
 *
 * @author R2-D2
 */
public class ServletContextListener implements javax.servlet.ServletContextListener {
    HashMap<String, HttpSession> sessionMap = new HashMap();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setAttribute("sessionMap", sessionMap);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().removeAttribute("sessionMap");
        sessionMap = null;
    }
}
