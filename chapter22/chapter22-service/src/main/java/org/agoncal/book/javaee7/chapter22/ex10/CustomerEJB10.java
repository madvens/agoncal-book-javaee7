package org.agoncal.book.javaee7.chapter22.ex10;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@Stateless
public class CustomerEJB10 {

    // ======================================
    // =             Attributes             =
    // ======================================

    @Inject
    private EntityManager em;


    // ======================================
    // =           Public Methods           =
    // ======================================

    public List<Customer10> findAll() {
        return null;
    }
}