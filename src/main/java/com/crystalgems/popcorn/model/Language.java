package com.crystalgems.popcorn.model;

import com.owlike.genson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

/**
 * Created by Antoine on 03/03/2017.
 */
@Entity
@Table(name = "language")
public class Language {
    private int id;
    private String language;
    private Set<Movie> movies;

    @Id
    @Column(name = "LanguageId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int languageId) {
        this.id = languageId;
    }

    @Basic
    @Column(name = "Language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @ManyToMany
    @JoinTable(
            name = "movielanguage",
            joinColumns = @JoinColumn(name = "LanguageId"),
            inverseJoinColumns = @JoinColumn(name = "MovieId")
    )
    @JsonIgnore
    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Language language1 = (Language) o;
        return Objects.equals(language, language1.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language);
    }
}
