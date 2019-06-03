package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Person;

public interface PersonService {
    Person findPersonByEmail(String email);

    void savePerson(Person person);
}