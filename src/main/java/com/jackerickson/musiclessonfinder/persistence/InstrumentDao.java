package com.jackerickson.musiclessonfinder.persistence;

import com.jackerickson.musiclessonfinder.entity.Instrument;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import java.util.List;

/**
 * Data access class to CRUD instruments.
 */
public class InstrumentDao {

    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Get instrument by id.
     */
    public Instrument getById(Long id) {
        Session session = sessionFactory.openSession();
        Instrument instrument = session.get(Instrument.class, id);
        session.close();
        return instrument;
    }

    /**
     * Update an instrument.
     * @param instrument Instrument to be updated
     */
    public void update(Instrument instrument) {
        Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            session.merge(instrument);
            transaction.commit();
            session.close();
    }

    /**
     * Insert an instrument.
     * @param instrument Instrument to be inserted
     * @return id of inserted instrument
     */
    public Long insert(Instrument instrument) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(instrument);
        transaction.commit();
        session.close();
        return instrument.getId();
    }

    /**
     * Delete an instrument.
     * @param instrument Instrument to be deleted
     */
    public void delete(Instrument instrument) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Instrument instrumentToDelete = session.get(Instrument.class, instrument.getId());
        session.delete(instrumentToDelete);
        transaction.commit();
        session.close();
    }

    /**
     * Return a list of all instruments.
     * @return All instruments
     */
    public List<Instrument> getAll() {
        Session session = sessionFactory.openSession();

        HibernateCriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Instrument> query = builder.createQuery(Instrument.class);
        Root<Instrument> root = query.from(Instrument.class);

        List<Instrument> instruments = session.createSelectionQuery(query).getResultList();

        logger.debug("The list of instruments " + instruments);
        session.close();

        return instruments;
    }
}
