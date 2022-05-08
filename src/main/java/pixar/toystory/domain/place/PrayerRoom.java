package pixar.toystory.domain.place;

import lombok.Getter;
import lombok.Setter;
import pixar.toystory.domain.TourInformation;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("P")
@Getter
@Setter
public class PrayerRoom extends TourInformation {
    private Boolean is_bible_exist;
    private Boolean is_gender_seperated;
}
