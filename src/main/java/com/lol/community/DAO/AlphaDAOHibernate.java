package com.lol.community.DAO;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author ljs
 * @version 1.0
 */


@Repository
@Qualifier("AlphaDAOHibernate")
public class AlphaDAOHibernate implements AlphaDAO{
    @Override
    public String select() {
        return "Hibernate";
    }
}
