package projectgroup_cse305;

import java.time.LocalDate;
import java.util.Calendar;

public class Patient extends User {

    // Data members
    protected LocalDate dOB;
    protected String job;
    protected String insurance;
    protected String height;
    protected String weight;
    protected String bloodType;

    // Constructors
    public Patient() {

    }

    public Patient(String dOB, String job, String insurance, String height, String weight, String bloodType) {
        this.dOB = LocalDate.parse(dOB);
        this.job = job;
        this.insurance = insurance;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
    }

    public Patient(String dOB, String job, String insurance, String height, String weight, String bloodType, String userName, String name, String phoneNumber,
            String email, String gender, String password) {
        super(userName, name, phoneNumber, email, gender, password);
        this.dOB = LocalDate.parse(dOB);
        this.job = job;
        this.insurance = insurance;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;

    }

    // Method
    public int calAge(LocalDate dOB) {
        Calendar instance = Calendar.getInstance();
        int currentYear = instance.get(Calendar.YEAR);

        return currentYear - dOB.getYear();

    }

    public LocalDate getdOB() {
        return dOB;
    }

    public void setdOB(LocalDate dOB) {
        this.dOB = dOB;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

}
