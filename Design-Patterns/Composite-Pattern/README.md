# Composite-Pattern
New Era University is composed of various organizational units. These units can be either individual entities or compositions of other entities. 

## The system should be able to represent the following:
**Colleges**: A College is a high-level organizational unit (e.g., "College of Engineering", "College of Business"). A College can contain departments, teachers, and students. It can also contain other Colleges (e.g., a university is composed of several Colleges).

**Departments**: A department is a subdivision within a College, focusing on a specific subject (e.g., "Department of Computer Science", "Department of Information Technology"). A department can contain teachers and students.

**Teachers**: A teacher is an individual entity responsible for instructing students. Each teacher has a name, a subject they teach, and a salary.
Students: A student is an individual entity enrolled in a College or department. Each student has a name, a unique student ID, and pays a tuition fee.

## Requirements:
**Model the hierarchical structure**: The system must accurately represent the "part-whole" relationship between the different entities (e.g., a College "has-a" department, a department "has-a" teacher).

**Calculate the number of students**: The system should be able to calculate the total number of students within any given College, including students in its departments and any sub-Colleges.

**Display details**: The system should be able to display the details of any educational unit (College, department, teacher, or student) in a clear and organized manner.

**Calculate the budget**: The system should be able to calculate the total budget for a College. The budget for a College is the sum of the budgets of its departments, teachers, and the negative sum of all the tuition fees of the students. The budget of a department is the sum of the budgets of its teachers and the negative sum of the tuition fees of the students in that department. A teacher's budget is their salary. A student's budget is the negative value of their tuition fee.