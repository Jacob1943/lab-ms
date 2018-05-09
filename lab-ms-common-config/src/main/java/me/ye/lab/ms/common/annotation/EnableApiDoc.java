package me.ye.lab.ms.common.annotation;

import me.ye.lab.ms.common.config.SwaggerConfig;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Jacob
 * @date 09/05/2018
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@EnableSwagger2
@Import(SwaggerConfig.class)
public @interface EnableApiDoc {
}
