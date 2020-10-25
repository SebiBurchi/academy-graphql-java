package com.telecom.academy.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.telecom.academy.graphql.models.Curs;
import com.telecom.academy.graphql.services.CursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class CursQuery implements GraphQLQueryResolver {

    @Autowired
    private CursService cursService;

    public List<Curs> getCursuri(final int numar) {
        return this.cursService.obtineToateCursurile(numar);
    }

    public Optional<Curs> getCurs(final int id) {
        return this.cursService.obtineCurs(id);
    }

}
