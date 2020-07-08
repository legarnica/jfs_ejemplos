package cl.lherrera.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExLoggerLevelApplication {
	
//	private final static Logger logger1 = Logger.getLogger(ExLoggerLevelApplication.class.getName());
	private final static Logger logger = LoggerFactory.getLogger(ExLoggerLevelApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ExLoggerLevelApplication.class, args);

		logger.info("Info logger");
		logger.warn("Warn logger");
		logger.error("Error logger");
	}

}
