package cibertec.edu.pe.appventascibertec.model.bd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    private Integer categoryid;
    @Column(name = "categoryname")
    private String categoryname;
    @Column(name = "description")
    private String description;

}
