package com.example.resourceserverwithoauth2;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@EnableResourceServer
@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	 @Override
	public void configure(HttpSecurity http) throws Exception {
	        http.csrf().disable();
	        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	        http.authorizeRequests()
	                .antMatchers("/secured/**")
	                    .authenticated()
	                .antMatchers("/**")
	                    .permitAll()
	                .anyRequest()
	                    .authenticated();
	    }

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		
		resources.resourceId ("webapp");
	}
	 
	 
}
