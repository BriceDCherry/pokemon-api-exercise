package com.bcherry4.pokemonapi.pokemon;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Data;

@Entity
@Data
@Table(name = "pokemon")
public class Pokemon {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(name = "name")
  private String name;

  @Column(name = "image_url")
  private String imageUrl;

public Long getId() {
    return null;
}

public Object getName() {
    return null;
}

public Object getImageUrl() {
    return null;
}

public void setName(Object name2) {
}

public void setImageUrl(Object imageUrl2) {
}
}