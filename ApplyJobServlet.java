import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ApplyJobServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String position = request.getParameter("position");
        String coverLetter = request.getParameter("cover-letter");

        // You would typically use a library like JavaMail to send the email here
        // This is a simplified example and does not send emails

        // For example, you might print the collected data to the server console
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Position: " + position);
        System.out.println("Cover Letter: " + coverLetter);

        // Provide a response to the client (e.g., a thank you page)
        response.sendRedirect("thankyou.html");
    }
}

