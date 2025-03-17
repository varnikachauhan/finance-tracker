package com.services.finance_tracker.model.scaler;

import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateScalar {
    public static final GraphQLScalarType DATE = GraphQLScalarType.newScalar().name("Date")
            .coercing(new Coercing<Date, String>() {
                private final SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

                @Override
                public String serialize(Object fetchedData) {
                    return dateFormat.format((Date) fetchedData);
                }

                @Override
                public Date parseValue(Object input) {
                    try {
                        return dateFormat.parse((String) input);
                    } catch (ParseException e) {
                        throw new IllegalArgumentException(e);
                    }
                }

                @Override
                public Date parseLiteral(Object input) {
                    if (input instanceof String) {
                        try {
                            return dateFormat.parse((String) input);
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Invalid date format");
                        }
                    }
                    return null;
                }

            }).build();
}
