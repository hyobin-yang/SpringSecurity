package springSecurity.practiceSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity(debug = true)
public class SecurityConfig {

    // 등록하고자 하는 시큐리티 빈 등록
    @Bean
    //@Order(1) 순서 지정 가능
    public SecurityFilterChain filterChain1(HttpSecurity http) throws Exception{
        // 필터 구현
        http.securityMatchers((auth) -> auth.requestMatchers(("/user"))); // 경로 설정
        http.authorizeHttpRequests((auth) -> auth.requestMatchers("/user").permitAll());

        http.csrf((csrf) -> csrf.disable()); // cors 필터 비활성화
        return http.build();
    }

    @Bean
    //@Order(2)
    public SecurityFilterChain filterChain2(HttpSecurity http) throws Exception{
        // 필터 구현
        http.securityMatchers((auth) -> auth.requestMatchers(("/admin"))); // 경로 설정
        http.authorizeHttpRequests((auth) -> auth.requestMatchers("/admin").permitAll());

        http.formLogin(Customizer.withDefaults()); // 폼로그인 필터 활성화
        return http.build();
    }

    // 이미지 경로에 대해서는 필터 무시
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        return web -> web.ignoring().requestMatchers("/img/**");
    }
}