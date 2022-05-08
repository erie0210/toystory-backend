package pixar.toystory.domain.place;

import lombok.Getter;
import lombok.Setter;
import pixar.toystory.domain.TourInformation;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
@Getter
@Setter
public class AttractionSite extends TourInformation {
    private Integer fee;
}
