package info.michaldec.springboot_workshops;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by michaldec on 02/10/15.
 */
public class VisitCheckServlet extends HttpServlet {

    private VisitCounter visitCounter;

    public VisitCheckServlet(VisitCounter visitCounter) {
        this.visitCounter = visitCounter;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Visit handled");
        visitCounter.increametCounter();
    }
}
