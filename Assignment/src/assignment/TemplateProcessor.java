package assignment;
import java.util.Map;
public interface TemplateProcessor {
	void loadTemplate(String name, String template);
	void loadTemplates(Map<String, String> templates);
	String expandTemplate(String templateName, Map<String, Object> context);
	}
