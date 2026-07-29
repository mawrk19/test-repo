import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.saml.SAMLAuthenticationProvider;
import org.springframework.security.saml.SAMLDefaultLogger;
import org.springframework.security.saml.SAMLEntryPoint;
import org.springframework.security.saml.SAMLWebSSOEntryPointFederation;
import org.springframework.security.saml.metadata.MetadataManager;
import org.springframework.security.saml.metadata.SAMLMetadataResolver;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers("/**").authenticated()
                .and()
                .addFilterBefore(new ShibbolethAuthenticator(), SAMLEntryPoint.class);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(new SAMLAuthenticationProvider());
    }
}