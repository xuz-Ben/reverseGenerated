package com.reverseGenerated.config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author xuz_Ben
 * @Date 2020/11/17
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api() {

    ParameterBuilder ticketPar = new ParameterBuilder();
    List<Parameter> pars = new ArrayList<Parameter>();
    ticketPar.name("token").description("可从jwt官网获取token:https://jwt.io/;例如:eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjoiMTIzNDU2In0.J1Z4DA021s0jboDwJ37tT2hR-ZSh1i_yZysWnSGh-lg")
        .modelRef(new ModelRef("string")).parameterType("header")
        .required(false).build(); //header中的ticket参数非必填，传空也可以
    pars.add(ticketPar.build());
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(apiInfo())
        .enable(true)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.demographicAnalysis"))
        .build()
        .globalOperationParameters(pars);

  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("API").description("api server")
        .version("1.0").build();
  }
}
