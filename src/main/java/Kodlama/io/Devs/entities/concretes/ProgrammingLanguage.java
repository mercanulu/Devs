package Kodlama.io.Devs.entities.concretes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;


@Table(name = "ProgrammingLanguages")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProgrammingLanguage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;
    @OneToMany(mappedBy ="programmingLanguage")
    private List<SubTechnology> subTechnologies;
}
