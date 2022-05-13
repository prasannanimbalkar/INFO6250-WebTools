
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <style>
            body {
                margin: 40px;
                padding: 10px 80px;
            }

            input {
                background: transparent;
                border: none;
                border-bottom: 1px solid #000000;
            }
            h3 {
                color: red;
            }

            #Academic_Term,
            #Academic_Year {
                margin: 0 12px 12px 0;
            }
        </style>
    </head>
    <body>
        <form  action="webForm" method="post" id="form1">
        <div>
            <h1 style='color:red;'>NORTHEASTERN UNIVERSITY</h1>
            <h3>Section 1</h3>
            <label for="Academic_Term">Academic Term:
                <input
                    type="text"
                    name="Academic_Term" 
                    required="required">
            </label>
            <label for="Academic_Year">Academic Year:
                <input
                    type="number"
                    id="Academic_Year"
                    name="Academic_Year"
                    placeholder="Enter your Year"
                    required="required">
            </label>
            <br/>
            <label>Employee Status:
                <label><input type="radio" name="EmpStatus" value="male">
                    Male</label>
                <label><input type="radio" name="EmpStatus" value="female">Female</label>
                <label><input type="radio" name="EmpStatus" value="other">Prefer not to Say</label>
                <label><input type="radio" name="EmpStatus" value="other">other<input type="text" name="EmpStatus_other"></label>
            </label>
        </div>
        <div>
            <h3>Section 2</h3>
            <label for="name">Student's Name:
                <input
                    type="text"
                    name="name" 
                    required="required">
            </label>
            <label for="relationToEmployee">Relationship to Employee:
                <input
                    type="text"
                    name="relationToEmployee" 
                    required="required">
            </label>
            <label for="change">Student's NUID:
                <input
                    type="text"
                    name="NUID" 
                    required="required">
            </label>
            <br/>
            <label for="differentEmpName">Employee's Name (if different from Student's)
                <input
                    type="text"
                    name="differentEmpName" 
                    required="required">
            </label>
            <label for="change">Employee's NUID
                <input
                    type="text"
                     
                    name="EmpNUID" 
                    required="required">
            </label>
            <br/>
            <label for="change">Department:
                <input
                    type="text"
                     
                    name="Department" 
                    required="required">
            </label>
            <label for="change">Campus Location:
                <input
                    type="text"
                     
                    name="Location" 
                    required="required">
            </label>
            <label for="change">Phone Number:
                <input
                    type="number"
                     
                    name="Number" 
                    required="required">
            </label>
            <label for="change">Supervisor's Name:
                <input
                    type="text"
                     
                    name="Supervisor" 
                    required="required">
            </label>
        </div>
        <div>
            <h3>Section 3
            </h3>
            <p>Indicate the applicable school or program:</p>

            <label><input type="radio" name="EmpStatus2" value="Undergraduate">Undergraduate Program Law School (excludes employees)</label>
            <label><input type="radio" name="EmpStatus2" value="Doctoral">Doctoral Candidate</label>
            <label><input type="radio" name="EmpStatus2" value="Doctoral">Doctoral Candidate</label>
            <label><input type="radio" name="EmpStatus2" value="Graduate">Graduate School</label>
            <label><input type="radio" name="EmpStatus2" value="CPS Graduate">CPS Graduate School</label>
            <p>One course per academic term may be taken one-half hour before the end of
                your workday. If this applies to you, this form must be signed by your
                supervisor below and approved by Human Resources Management.</p>
            <p>Complete the following course information. If you are an employee taking a
                job related course, please attach the Job Related Designation Form to this
                waiver.</p>

            <table style="width:100%">
                <tr>
                    <th>Course No.</th>
                    <th>Course Name</th>
                    <th>Supervisor Signature</th>
                    <th>Credit Hrs.</th>
                    <th>Day(s)</th>
                    <th>Time</th>
                </tr>
                <tr>
                    <td><input type="number"   name="Course_no1"></td>
                    <td><input type="text"  name="Course_name1"></td>
                    <td><input type="text"   name="SupervisorSignature1"></td>
                    <td><input type="text"   name="CreditHrs1"></td>
                    <td><input type="text"   name="Day1"></td>
                    <td><input type="time"   name="Time1"></td>
                </tr>

                <tr>
                    <td><input type="number"   name="Course_no2"></td>
                    <td><input type="text"  name="Course_name2"></td>
                    <td><input type="text"   name="SupervisorSignature2"></td>
                    <td><input type="text"   name="CreditHrs2"></td>
                    <td><input type="text"   name="Day2"></td>
                    <td><input type="time"   name="Time2"></td>
                </tr>

                <tr>
                    <td><input type="number"   name="Course_no3"></td>
                    <td><input type="text"   name="Course_name3"></td>
                    <td><input type="text"   name="SupervisorSignature3"></td>
                    <td><input type="text"   name="CreditHrs3"></td>
                    <td><input type="text"   name="Day3"></td>
                    <td><input type="time"   name="Time3"></td>
                </tr>
            </table>

        </div>
        <div>
            <h3>Section 4
            </h3>
            <p>In accordance with Northeastern University's Tuition Waiver Program
                Guidelines, my signature attests that I am currently enrolled in the above
                courses, or that the student listed above is my spouse, domestic partner or
                unmarried dependent child or the dependent child of my domestic partner as
                defined under current IRS tax regulations. I also certify that I have read the
                Tuition Waiver Program Guidelines.</p>

            <label for="change">Employee's Signature</label>
            <input
                type="text"
                 
                name="EmployeeSig"
                placeholder="Enter your Name"
                required="required">
        </label>
        <label for="change">Date:
            <input
                type="datetime-local"
                 
                name="date"
                placeholder="Enter your Name"
                required="required">
        </label>
    </div>
    <div>
        <h3>Section 5
        </h3>

        <label for="change">HRM Approval</label>
        <input
            type="text"
             
            name="HRMA"
            placeholder="Enter your Name"
            required="required">
    </label>
    <label for="change">Date:
        <input
            type="datetime-local"
            name="date2"
            placeholder="Enter your Name"
            required="required">
    </label>

</div>

</form>
<button type="submit" form="form1" value="Submit">Submit</button>
</body>
</html>