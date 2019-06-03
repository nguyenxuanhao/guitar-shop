package org.group02.guitarshop.service;

import org.group02.guitarshop.entity.Role;
import org.group02.guitarshop.entity.Person;
import org.group02.guitarshop.repository.RoleRepository;
import org.group02.guitarshop.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service("personService")
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository,
                             RoleRepository roleRepository,
                             BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.personRepository = personRepository;
        this.roleRepository = roleRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Person findPersonByEmail(String email) {
        return personRepository.findByEmail(email);
    }

    public void savePerson(Person person) {
        person.setPassword(bCryptPasswordEncoder.encode(person.getPassword()));
        Role personRole = roleRepository.findByRoleName("user");
        person.setRoles(new HashSet<Role>(Arrays.asList(personRole)));
        personRepository.save(person);
    }

}