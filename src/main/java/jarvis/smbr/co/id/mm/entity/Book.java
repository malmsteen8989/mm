package jarvis.smbr.co.id.mm.entity;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jarvis.smbr.co.id.mm.entity.ids.BookId;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "book")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Audited
@Entity
@IdClass(BookId.class)
public class Book extends Auditable<String> {
    @Id
    private String id;
    @Id
    private String title;
    private String author;
}
