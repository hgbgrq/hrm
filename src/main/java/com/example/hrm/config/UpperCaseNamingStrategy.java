package com.example.hrm.config;

import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class UpperCaseNamingStrategy extends CamelCaseToUnderscoresNamingStrategy {

    @Override
    protected Identifier getIdentifier(String name, boolean quoted, JdbcEnvironment jdbcEnvironment) {
        return new Identifier(name.toUpperCase(), quoted); // 파라미터로 넘어온 name값을 대문자화 시킵니다.
    }

}
