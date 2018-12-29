package org.skan.practice.sfgpetclinic.services;

import org.skan.practice.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
