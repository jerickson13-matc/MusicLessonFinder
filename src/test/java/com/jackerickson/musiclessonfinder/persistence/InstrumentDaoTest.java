package com.jackerickson.musiclessonfinder.persistence;

import com.jackerickson.musiclessonfinder.entity.Instrument;
import com.jackerickson.musiclessonfinder.test.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Instrument dao test.
 */
class InstrumentDaoTest {

    InstrumentDao dao;

    /**
     * Sets up the instrument table with fresh data
     * before each test and instantiates InstrumentDao.
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleanDB.sql");
        dao = new InstrumentDao();
    }

    /**
     * Tests if getById() is successful.
     */
    @Test
    void getByIdSuccess() {
        Instrument retrievedInstrument = dao.getById(3L);

        assertNotNull(retrievedInstrument);
        assertEquals("Drums", retrievedInstrument.getName());
    }

    /**
     * Tests if update() is successful.
     */
    @Test
    void update() {
        Instrument instrumentToUpdate = dao.getById(1L);
        instrumentToUpdate.setName("Electric Guitar");
        dao.update(instrumentToUpdate);

        Instrument actualInstrument = dao.getById(1L);
        assertEquals("Electric Guitar", actualInstrument.getName());
    }

    /**
     * Tests if insert() is successful.
     */
    @Test
    void insert() {
        Instrument instrumentToInsert = new Instrument("Violin");
        Long insertedInstrumentId = dao.insert(instrumentToInsert);

        assertNotNull(insertedInstrumentId);
        assertNotEquals(0L, insertedInstrumentId);

        Instrument insertedInstrument = dao.getById(insertedInstrumentId);

        assertNotNull(insertedInstrument);
        assertEquals("Violin", insertedInstrument.getName());
    }

    /**
     * Tests if delete() is successful.
     */
    @Test
    void delete() {
        dao.delete(dao.getById(2L));

        assertNull(dao.getById(2L));
    }

    /**
     * Tests if getAll() is successful.
     */
    @Test
    void getAll() {
        List<Instrument> instruments = dao.getAll();

        assertEquals(3, instruments.size());
    }
}