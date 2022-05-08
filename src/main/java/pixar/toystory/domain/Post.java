package pixar.toystory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {
    @Id @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments = new ArrayList<>();
}
