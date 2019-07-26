package com.example.demo;
import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Project_data implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PNUMBER", nullable = false)
    private Integer PNUMBER;

    @Column(name = "PNAME", nullable = false)
    private String PNAME;

    @Column(name = "PLOCATION", nullable =false)
    private String PLOCATION;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getPNUMBER() {
        return PNUMBER;
    }

    public void setPNUMBER(Integer PNUMBER) {
        this.PNUMBER = PNUMBER;
    }

    public String getPNAME() {
        return PNAME;
    }

    public void setPNAME(String PNAME) {
        this.PNAME = PNAME;
    }

    public String getPLOCATION() {
        return PLOCATION;
    }

    public void setPLOCATION(String PLOCATION) {
        this.PLOCATION = PLOCATION;
    }

}
