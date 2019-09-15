package com.simplon.esportdata.services;

import com.simplon.esportdata.RessourceNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public abstract class AbstractService {

    protected AbstractService() {
    }

    protected <T> T findById(Long id, JpaRepository<T, Long> repo) {
        Optional<T> optional = repo.findById(id);
        String message = "with id =" + id;
        return optional.orElseThrow(() -> new RessourceNotFoundException(message));
    }
}
