<!DOCTYPE html>
<html>
<head>
   
</head>
<body>
    <h1>Employee Payroll System</h1>
    <p>
        This Java project demonstrates an <strong>Employee Payroll System</strong> using Object-Oriented Programming principles. 
        It supports managing <em>full-time</em> and <em>part-time</em> employees, including salary calculation and management of the employee list.
    </p>
      .
    <h2>Features</h2>
    <ul>
        <li>Abstract class <code>Employee</code> for common employee attributes and behavior.</li>
        <li>Two concrete implementations:
            <ul>
                <li><code>fulltimeemployee</code>: Calculates salary based on a monthly rate.</li>
                <li><code>parttimeemployee</code>: Calculates salary based on hourly rate and hours worked.</li>
            </ul>
        </li>
        <li>Payroll system with functionalities to add, remove, and display employees.</li>
    </ul>
        *
    <h2>Usage</h2>
    <ol>
        <li>Clone this repository.</li>
        <li>Compile the code: <code>javac Main.java</code></li>
        <li>Run the application: <code>java Main</code></li>
    </ol>
*
    <h2>Example Output</h2>
    <pre>
Initial employee details: 
Employee [name = utosh, id = 100, salary = 40000.0]
Employee [name = aditya, id = 101, salary = 48000.0]

Removing employee 

Remaining employees: 
Employee [name = utosh, id = 100, salary = 40000.0]
    </pre>
*
    <h2>Project Structure</h2>
    <ul>
        <li><code>Employee</code>: Abstract class with common attributes (name, id) and an abstract <code>calculatesalary()</code> method.</li>
        <li><code>fulltimeemployee</code>: Extends <code>Employee</code> and overrides <code>calculatesalary()</code> to return the monthly salary.</li>
        <li><code>parttimeemployee</code>: Extends <code>Employee</code> and calculates salary based on hourly rate and hours worked.</li>
        <li><code>payrollsystem</code>: Manages the employee list with add, remove, and display functionalities.</li>
        <li><code>Main</code>: Demonstrates the payroll system.</li>
    </ul>
*
    <h2>CREATED BY </h2>
    <p>UTOSH NARAYAN</p>
</body>
</html>
