package com.bautista.dependencyinyection;

import com.bautista.dependencyinyection.lifecicle.LifeCicleBean;
import com.bautista.dependencyinyection.profiles.EnvironmentService;
import com.bautista.dependencyinyection.qualifiers.Animal;
import com.bautista.dependencyinyection.qualifiers.Nido;
import com.bautista.dependencyinyection.scopes.EjemploScopeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DependencyInyectionApplication {
    private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

    @Bean
    public String getApplicationName(){
        return "Vellmond Rules!";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
        String name = context.getBean(String.class);
        log.info("Nombre de la aplicacion: {}",name);
        // ------------------muestra el scope de los beans
        /* EjemploScopeService ejemploScopeService = context.getBean(EjemploScopeService.class);
        EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
        log.info("are beans Equals {}",ejemploScopeService.equals(ejemploScopeService1));
        log.info("are beans == {}",ejemploScopeService==ejemploScopeService1);*/

//        ------------------muestra el ambiente activo
        EnvironmentService environmentService=context.getBean(EnvironmentService.class);
        log.info("Active Environment: {}",environmentService.getEnvironment());

//        ------------------muestra el nombre del animal
//        Pajaro pajaro = context.getBean(Pajaro.class);
//        log.info("Objeto Pajaro {}",pajaro.getNombre() );
//        ------------------muestra el avion volando
//        Avion avion = context.getBean(Avion.class);
//        avion.volar();
//        Nido nido= context.getBean(Nido.class);
//        nido.imprimir();
//        log.info("Animal nombre={} edad={}",animal.getNombre(), animal.getEdad());
        LifeCicleBean bean = context.getBean(LifeCicleBean.class);


    }

}
