package com.bautista.dependencyinyection.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class EjemploScopeService {
}
