import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 300)
    private String title;

    @Lob
    @Column(nullable = false)

    private String body;
    @ManyToOne(optional = false)

    private User author;
    @Column(nullable = false)

    private LocalDateTime dateTime = LocalDateTime.now();

}
