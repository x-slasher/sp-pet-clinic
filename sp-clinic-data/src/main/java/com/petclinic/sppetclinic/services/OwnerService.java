package com.petclinic.sppetclinic.services;

import com.petclinic.sppetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
