package profile1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//4.创建一个统一配置类SystemConfig，并将三个配置类引入，因为各自定义了作用域（DefaultConfig未明文指定），所以引入并不会导致冲突
@Configuration
@Import({DevConfig.class,ProdConfig.class,DefaultConfig.class})
public class SystemConfig {}
