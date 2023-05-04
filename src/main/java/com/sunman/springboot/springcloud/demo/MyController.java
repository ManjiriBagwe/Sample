package com.sunman.springboot.springcloud.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*import brave.Span;
import brave.Tracing;
import brave.propagation.CurrentTraceContext.Scope;
import io.micrometer.core.instrument.MeterRegistry;*/

@RestController
@RefreshScope
public class MyController {

	/*
	 * private final MeterRegistry meterRegistry; private final Tracing tracing;
	 * //private static final Logger logger =
	 * LoggerFactory.getLogger(SpringbootLoggerDemoApplication.class);
	 * 
	 * @Autowired public MyController(MeterRegistry meterRegistry, Tracing tracing)
	 * { this.meterRegistry = meterRegistry; this.tracing = tracing; }
	 */
    

	
	@Value("${message:default message}") 
	private String message;
	
	@GetMapping("/message")
	public String getMessage() {
		//return "hi";
		return message;
	}

    @GetMapping("/")
    public String hello() {
    	//logger.info("**** In hello***");
		/*
		 * Span span = tracing.tracer().newTrace().start(); try (Scope scope =
		 * tracing.currentTraceContext().newScope(span.context())) { // Do something
		 * meterRegistry.counter("mycounter").increment(); //
		 * logger.info("**** In hello 2***"+span+", scope : "+scope);
		 * 
		 * } catch (Exception e) { span.error(e); throw e; } finally { span.finish(); }
		 */
        
        
        return "Hello, world!";
    }

}
