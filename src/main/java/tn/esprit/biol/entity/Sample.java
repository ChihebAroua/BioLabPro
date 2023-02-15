package tn.esprit.biol.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Sample implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SampleID;
    private Date Dateofwithdrawl;
    private boolean Urgency;
 
    @OneToOne
    @JoinColumn(name = "id")
    private User userID;



}
