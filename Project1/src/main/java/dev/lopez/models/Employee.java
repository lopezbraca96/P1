package dev.lopez.models;

public class Employee {

    private Integer userid;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String email;
    private String department;
    private String position1;
    private String position2;
    private Double availableReimbursement;
    //reportto

    //constructor 1
    public Employee() {
    }

    //constructor 2
    public Employee(String firstname, String lastname, String username, String password, String email, String department) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.department = department;
    }

    //constructor 3
    public Employee(Integer userid, String firstname, String lastname, String username, String password, String email, String department, String position1, String position2, Double availablereimbursement) {
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.department = department;
        this.position1 = position1;
        this.position2 = position2;
        this.availableReimbursement = availablereimbursement;
    }

    //Getters and setters


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition1() {
        return position1;
    }

    public void setPosition1(String position1) {
        this.position1 = position1;
    }

    public String getPosition2() {
        return position2;
    }

    public void setPosition2(String position2) {
        this.position2 = position2;
    }


    public Double getAvailableReimbursement() {
        return availableReimbursement;
    }

    public void setAvailableReimbursement(Double availableReimbursement) {
        this.availableReimbursement = availableReimbursement;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "userid=" + userid +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", position1='" + position1 + '\'' +
                ", position2='" + position2 + '\'' +
                ", availablereimbursement=" + availableReimbursement +
                '}';
    }
}
