package com.example.Basic.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    /*TODO: we can use MapStruct instead of ModelMapper,
     but it is more complex to set up and use. ModelMapper
     is a simple and easy to use library for mapping objects,
     while MapStruct is a code generator that creates
     mapping code at compile time. MapStruct can be
     faster than ModelMapper, but it requires more setup
     and configuration. For this project, we will use
     ModelMapper for simplicity and ease of use.
     */
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }


}
