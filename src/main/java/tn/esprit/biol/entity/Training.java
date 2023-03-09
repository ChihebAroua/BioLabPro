package tn.esprit.biol.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int TrainingId;
    String TrainingName;
    String TrainingSubject;
    @Enumerated(EnumType.STRING)
    TrainingMethod trainingMethod;
    LocalDateTime Training_startdate;
    LocalDateTime Training_enddate;
    @OneToOne(mappedBy="training")

    private Certifcate certifcate;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "trainings")
    @JsonIgnoreProperties("Training")
    private Set<User> trainees;
    @OneToOne(mappedBy = "training")
    User trainer;


}
