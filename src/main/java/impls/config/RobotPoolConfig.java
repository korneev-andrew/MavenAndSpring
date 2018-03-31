package impls.config;

import impls.robots.RobotMark1;
import impls.robots.RobotMark2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by andrew_korneev on 31.03.2018.
 */
@Configuration
public class RobotPoolConfig {

    @Bean
    public BeanDefinitionRegistryPostProcessor config() {
        return new Config();
    }

    private class Config implements BeanDefinitionRegistryPostProcessor {
        @Override
        public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
            GenericBeanDefinition mark1 = new GenericBeanDefinition();
            mark1.setBeanClass(RobotMark1.class);
            mark1.getPropertyValues().add("name", "RobotMark1");
            registry.registerBeanDefinition("RobotMark1", mark1);

            GenericBeanDefinition mark2 = new GenericBeanDefinition();
            mark2.setBeanClass(RobotMark2.class);
            mark2.getPropertyValues().add("name", "RobotMark2");
            registry.registerBeanDefinition("RobotMark2", mark2);
        }

        @Override
        public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws
                BeansException {

        }
    }
}
