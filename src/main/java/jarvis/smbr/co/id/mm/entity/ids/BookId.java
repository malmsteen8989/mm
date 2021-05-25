package jarvis.smbr.co.id.mm.entity.ids;

import java.io.Serializable;

import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode

public class BookId implements Serializable {
    private static final Long serialVersionUID = 1L;
    
    @Id
    private String id;
    @Id
    private String title;
}
