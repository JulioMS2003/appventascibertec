package cibertec.edu.pe.appventascibertec.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    private Integer customerid;
    @Column(name = "companyname")
    private String companyname;
    @Column(name = "contactname")
    private String contactname;
    @Column(name = "contacttitle")
    private String contacttitle;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "region")
    private String region;
    @Column(name = "postalcode")
    private String postalcode;
    @Column(name = "country")
    private String country;
    @Column(name = "phone")
    private String phone;
    @Column(name = "fax")
    private String fax;

}
