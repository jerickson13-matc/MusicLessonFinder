package com.jackerickson.musiclessonfinder.entity;

import jakarta.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Represents a musical instrument.
 */
@Entity(name = "Instrument")
@Table(name = "instruments")
public class Instrument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    /**
     * Instantiates a new Instrument.
     */
    public Instrument() {
    }

    /**
     * Instantiates a new Instrument with an id.
     *
     * @param id the instrument id
     * @param name the instrument name
     */
    public Instrument(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Instantiates a new Instrument without an id.
     *
     * @param name the instrument name
     */
    public Instrument(String name) {
        this.name = name;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
