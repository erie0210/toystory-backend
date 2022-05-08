package pixar.toystory.domain.place;

import lombok.Getter;
import lombok.Setter;
import pixar.toystory.domain.TourInformation;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
@Getter @Setter
public class Restaurant extends TourInformation {
    private String certification;
    private Boolean is_alcohol_exist;
}
