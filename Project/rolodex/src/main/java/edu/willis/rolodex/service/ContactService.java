package edu.willis.rolodex.service;

import edu.willis.rolodex.model.Contact;
import edu.willis.rolodex.storage.*;

import java.util.List;

/**
 * SERVICE LAYER
 */

public class ContactService {

    private Storage storage = new FileStorage();

    public void add(Contact c) {
        storage.save(c);
    }

    public List<Contact> getAll() {
        return storage.findAll();
    }
}