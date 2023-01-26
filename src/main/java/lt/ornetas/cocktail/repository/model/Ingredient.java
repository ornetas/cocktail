package lt.ornetas.cocktail.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "city")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Ingredient {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

}