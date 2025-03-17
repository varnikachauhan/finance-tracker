package com.services.finance_tracker.model.scaler;

import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;

import java.util.regex.Pattern;

public class EmailScalar {
    public static final GraphQLScalarType EMAIL = GraphQLScalarType.newScalar()
            .name("Email")
            .coercing(new Coercing<String, String>() {
                private final Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

                @Override
                public String serialize(Object fetchedData) {
                    return (String) fetchedData;
                }

                @Override
                public String parseValue(Object input) {
                    String value = (String) input;
                    if (emailPattern.matcher(value).matches()) {
                        return value;
                    } else {
                        throw new IllegalArgumentException("Invalid email format");
                    }
                }

                @Override
                public String parseLiteral(Object input) {
                    if (input instanceof String) {
                        String value = (String) input;
                        if (emailPattern.matcher(value).matches()) {
                            return value;
                        } else {
                            throw new IllegalArgumentException("Invalid email format");
                        }
                    }
                    return null;
                }
            }).build();
}
