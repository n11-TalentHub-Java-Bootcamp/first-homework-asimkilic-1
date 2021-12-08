package entity;


import javax.persistence.*;

@Entity
@Table(name = "USER", schema = "public")
public class User {
    @SequenceGenerator(name = "user_generator", sequenceName = "USER_ID_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "user_generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME", length = 50)
    private String firstName;

    @Column(name = "LAST_NAME", length = 50)
    private String lastName;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "CELL_PHONE", length = 15)
    private String cellPhone;

    // Constructors
    public User() {
    }

    public User(Long id, String firstName, String lastName, String email, String cellPhone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cellPhone = cellPhone;
    }

    // Overrides
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", cellPhone='" + cellPhone + '\'' +
                '}';
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }
}
