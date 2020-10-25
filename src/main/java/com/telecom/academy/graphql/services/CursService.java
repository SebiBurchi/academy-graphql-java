package com.telecom.academy.graphql.services;

import com.telecom.academy.graphql.models.Curs;
import com.telecom.academy.graphql.repositories.CursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CursService {

    @Autowired
    private CursRepository cursRepository;

    @Transactional(readOnly = true)
    public List<Curs> obtineToateCursurile(final int numar) {
        return this.cursRepository.findAll().stream().limit(numar).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Curs> obtineCurs(final int id) {
        return this.cursRepository.findById(id);
    }

    @Transactional
    public Curs creareCurs(String titlu, String descriere, String autor) {
        final Curs curs = new Curs();
        curs.setAutor(autor);
        curs.setDescriere(descriere);
        curs.setTitlu(titlu);

        return this.cursRepository.save(curs);
    }

}
