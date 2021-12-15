package com.codegym.educationmanager.service.ministry;

import com.codegym.educationmanager.model.ministry.Ministry;
import com.codegym.educationmanager.repository.IMinistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MinistryService implements IMinistryService{
    @Autowired
    private IMinistryRepository ministryRepository;
    @Override
    public Iterable<Ministry> findAll() {
        return ministryRepository.findAll();
    }

    @Override
    public Optional<Ministry> findById(Long id) {
        return ministryRepository.findById(id);
    }

    @Override
    public void save(Ministry ministry) {
        ministryRepository.save(ministry);
    }

    @Override
    public void deleteById(Long id) {
        ministryRepository.deleteById(id);
    }
}
