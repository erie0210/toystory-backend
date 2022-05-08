package pixar.toystory.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
@Getter @Setter
public abstract class TourInformation {
    @Id
    @GeneratedValue
    @Column(name = "tour_information_id")
    private Long id;
}
