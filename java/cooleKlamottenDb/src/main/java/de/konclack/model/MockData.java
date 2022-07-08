package de.konclack.model;

public class MockData {

    private static final String DEFAULT_NAME = "<<noch kein Name>>";
    private static final String DEFAULT_LAST_NAME = "<<noch kein VorName>>";
    private static final String DEFAULT_EMAIL = "<<noch kein Email>>";
    private static final String DEFAULT_GENDER = "<<noch kein Gender>>";
    private static final String SPLIT_CHAR = ";";
    private static final Integer DEFAULT_IP_ADDRESS = 1;

    private String first_name;
    private String last_name;
    private String email;
    private String gender;

    private Integer ip_address;

    public MockData() {
        this.first_name = DEFAULT_NAME;
        this.last_name = DEFAULT_LAST_NAME;
        this.email = DEFAULT_EMAIL;
        this.gender = DEFAULT_GENDER;
        this.ip_address = DEFAULT_IP_ADDRESS;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getIp_address() {
        return ip_address;
    }

    public void setIp_address(Integer ip_address) {
        this.ip_address = ip_address;
    }

    @Override
    public String toString() {
        return "MockData{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", ip_address=" + ip_address +
                '}';
    }
}
