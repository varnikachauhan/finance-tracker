package com.services.finance_tracker.configuration;

import com.services.finance_tracker.model.scaler.DateScalar;
import com.services.finance_tracker.model.scaler.EmailScalar;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {

    @Bean
    public GraphQL graphQL() {
        GraphQLSchema graphQLSchema = GraphQLSchema.newSchema()
                .additionalType(DateScalar.DATE)
                .additionalType(EmailScalar.EMAIL)
                .build();
        return GraphQL.newGraphQL(graphQLSchema).build();
    }
}
