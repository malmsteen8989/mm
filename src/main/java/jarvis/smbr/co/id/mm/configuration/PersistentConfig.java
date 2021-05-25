package jarvis.smbr.co.id.mm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import jarvis.smbr.co.id.mm.entity.AuditorAwareImpl;


@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class PersistentConfig {
    @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }
}