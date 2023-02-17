package tn.esprit.biol.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Sample implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SampleID;
    @Temporal(TemporalType.DATE)
    private Date Dateofwithdrawl;
    private boolean Urgency;

    @ManyToOne
    private User user;



}
