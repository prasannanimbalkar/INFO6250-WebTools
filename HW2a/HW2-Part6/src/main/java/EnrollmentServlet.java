import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class EnrollmentServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html");

        String Academic_Term = request.getParameter("Academic_Term");
        String Academic_Year = request.getParameter("Academic_Year");
        String EmpStatus = request.getParameter("EmpStatus");
        String EmpStatus_other = request.getParameter("EmpStatus_other");
        String name = request.getParameter("name");
        String relationToEmployee = request.getParameter("relationToEmployee");
        String NUID = request.getParameter("NUID");
        String differentEmpName = request.getParameter("differentEmpName");
        String EmpNUID = request.getParameter("EmpNUID");
        String  Department = request.getParameter("Department");
        String Location = request.getParameter("Location");
        String Number = request.getParameter("Number");
        String Supervisor = request.getParameter("Supervisor");
        String EmpStatus2 = request.getParameter("EmpStatus2");
        
        String Course_no1 = request.getParameter("Course_no1");
        String Course_name1 = request.getParameter("Course_name1");
        String SupervisorSignature1 = request.getParameter("SupervisorSignature1");
        String CreditHrs1 = request.getParameter("CreditHrs1");
        String Day1 = request.getParameter("Day1");
        String Time1 = request.getParameter("Time1");

        String Course_no2 = request.getParameter("Course_no2");
        String Course_name2 = request.getParameter("Course_name2");
        String SupervisorSignature2 = request.getParameter("SupervisorSignature2");
        String CreditHrs2 = request.getParameter("CreditHrs2");
        String Day2 = request.getParameter("Day2");
        String Time2 = request.getParameter("Time2");
        
        String Course_no3 = request.getParameter("Course_no3");
        String Course_name3 = request.getParameter("Course_name3");
        String SupervisorSignature3 = request.getParameter("SupervisorSignature3");
        String CreditHrs3 = request.getParameter("CreditHrs3");
        String Day3 = request.getParameter("Day3");
        String Time3 = request.getParameter("Time3");
        
        String EmployeeSig = request.getParameter("EmployeeSig");
        String date = request.getParameter("date");
        String HRMA = request.getParameter("HRMA");
        String date2 = request.getParameter("date2");


        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>");
        out.println("<Form Details>");
        out.println("</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<H1 style='color:red;'>NORTHEASTERN UNIVERSITY</H1>");

        out.println("<H3>Section1 : </H3>");
        out.println("Academic Term: " + Academic_Term);
        out.println("<br/>");
        out.println("Academic Year " + Academic_Year);
        out.println("<br/>");

        out.println("Employee Status: " + EmpStatus);
        out.println("other: " + EmpStatus_other);
        out.println("<br/>");

        out.println("<H3>Section 2: </H3>");
        out.println("Student's Name: " + name);
        out.println("<br/>");
        out.println("Relationship to Employee: " + relationToEmployee);
        out.println("<br/>");
        out.println("Student's NUID: " + NUID);
        out.println("<br/>");
        out.println("Employee's Name (if different from Student's) " + differentEmpName);
        out.println("<br/>");
        out.println("Employee's NUID " + EmpNUID);
        out.println("<br/>");
        out.println("Department: " + Department);
        out.println("<br/>");
        out.println("Campus Location: " + Location);
        out.println("<br/>");
        out.println("Phone Number: " + Number);
        out.println("<br/>");
        out.println("Supervisor's Name: " + Supervisor);
        out.println("<br/>");


        out.println("<H3>Section 3: </H3>");
        out.println("Indicate the applicable school or program: " + EmpStatus2);
        out.println("<br/>");
        //out.println("<table style='width:100%'><tr><th>Course No.</th><th>Course Name</th><th>Supervisor Signature</th><th>Credit Hrs.</th><th>Day(s)</th><th>Time</th></tr>");

        out.println("Course No.: " + Course_no1 );out.println("<br/>");
        out.println("Course Name: " + Course_name1);out.println("<br/>");
        out.println("Supervisor Signature: "+ SupervisorSignature1);out.println("<br/>");
        out.println("Credit Hrs.: " + CreditHrs1);out.println("<br/>");
        out.println("Day(s): " + Day1);out.println("<br/>");
        out.println("Time: " + Time1);out.println("<br/>");
        out.println("<br/>");

        out.println("Course No.: " + Course_no2);out.println("<br/>");
        out.println("Course Name: " + Course_name2);out.println("<br/>");
        out.println("Supervisor Signature: " + SupervisorSignature2);out.println("<br/>");
        out.println("Credit Hrs.: " + CreditHrs2);out.println("<br/>");
        out.println("Day(s): " + Day2);out.println("<br/>");
        out.println("Time: " + Time2);out.println("<br/>");
        out.println("<br/>");

        out.println("Course No.: " + Course_no3);out.println("<br/>");
        out.println("Course Name: " + Course_name3);out.println("<br/>");
        out.println("Supervisor Signature: " + SupervisorSignature3);out.println("<br/>");
        out.println("Credit Hrs.: " + CreditHrs3);out.println("<br/>");
        out.println("Day(s): " + Day3);out.println("<br/>");
        out.println("Time: " + Time3);out.println("<br/>");
        out.println("<br/>");

        
        
        

        out.println("<H3>Section 4 : </H3>");
        out.println("<p>In accordance with Northeastern</p>");
        //out.println("<br/>");
        out.println("Employee's Signature: " + EmployeeSig+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        out.println("Date: " + date);
        out.println("<br/><br/>");
        out.println("HRM Approval: " + HRMA+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        out.println("Date: " + date2);
        out.println("<br/>");
        


        out.println("</body>");
        out.println("</html>");
    }

}
