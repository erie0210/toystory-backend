package pixar.toystory.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String email;

    private String nickname;

    @OneToMany(mappedBy = "member")
    private List<Comment> comments = new ArrayList<>();
}
