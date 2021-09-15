package masterpian0.model;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name="roles")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private Set<User> users;

    public Role(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getAuthority() {
        return name;
    }
}
