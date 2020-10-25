package com.telecom.academy.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.telecom.academy.graphql.models.Curs;
import com.telecom.academy.graphql.services.CursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CursMutation implements GraphQLMutationResolver {

    @Autowired
    private CursService cursService;

    public Curs creareCurs(String titlu, String descriere, String autor) {
        return this.cursService.creareCurs(titlu, descriere, autor);
    }
}
