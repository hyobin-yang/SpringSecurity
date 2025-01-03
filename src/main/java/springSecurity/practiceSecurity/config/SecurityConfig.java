package springSecurity.practiceSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 등록하고자 하는 시큐리티 빈 등록
    @Bean
    public SecurityFilterChain filterChain1(HttpSecurity http) throws Exception{
        // 필터 구현
        http.securityMatchers((auth) -> auth.requestMatchers(("/user"))); // 경로 설정
        http.authorizeHttpRequests((auth) -> auth.requestMatchers("/user").permitAll());
        return http.build();
    }

    @Bean
    public SecurityFilterChain filterChain2(HttpSecurity http) throws Exception{
        // 필터 구현
        http.securityMatchers((auth) -> auth.requestMatchers(("/admin"))); // 경로 설정
        http.authorizeHttpRequests((auth) -> auth.requestMatchers("/admin").permitAll());
        return http.build();
    }
}