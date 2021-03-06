# spring-boot2-oauth2-resource-server
Sample project that demonstrates Spring Boot 2 with OAuth2 and resource server

# Why?
What I wanted was:
- Spring Boot 2.x application
- Resource Server 
- OAuth2 Token based security
- Integration with any OAuth2 implementing server

For some reason, I had difficulty finding the exact recipe required to get this working.

In addition to that, the new Spring Security 5 OAuth2 support does not (yet) seem to support 
the resource server idea.
See:
- https://github.com/spring-projects/spring-security/issues/5226
- https://github.com/spring-projects/spring-security/issues?q=is%3Aissue+is%3Aopen+label%3AOAuth2

So when I finally DID get it working, I thought I'd throw it out there in case somebody else can benefit.


# Building
`mvn package`

# Running
## Prerequisite
You will need access to an OAuth2 compliant authorization server.

I used [Keycloak in a docker container](https://hub.docker.com/r/jboss/keycloak/).

In theory, any OAuth2 compliant server will do.

## Running
TL;DR: `mvn spring-boot:run`

Detailed instructions can be [found here](https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-running-your-application.html) 

# Things to watch out for
- this is intended as a "resource server". In my mind that means API. It expects the caller to have obtained valid 
   auth token to use as a `Bearer` token elsewhere (i.e. a call to the OAuth2 server).
   

# References
- https://dzone.com/articles/spring-boot-2-applications-and-oauth-2-legacy-appr
- https://docs.spring.io/spring-security-oauth2-boot/docs/current-SNAPSHOT/reference/htmlsingle/
- https://medium.com/@akourtim.ahmed/oauth-2-centralized-authorization-with-spring-boot-2-0-2-and-spring-security-5-and-jdbc-token-store-8dbc063bd5d4
