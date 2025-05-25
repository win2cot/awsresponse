package ssm;

import lombok.extern.slf4j.Slf4j;
import software.amazon.awssdk.services.ssm.SsmClient;
import software.amazon.awssdk.services.ssm.model.ParameterType;

@Slf4j
public class Ssm {

	public static void main(String[] args) {
		try (SsmClient client = SsmClient.builder().build()) {
			for	(int i = 1; i <= 15; i++) {
				String path = String.format("/test/prd/path%02d", i);
				String value = String.format("data%02d", i);
				client.putParameter(builder -> builder.name(path).type(ParameterType.STRING).value(value));
			}
			client.putParameter(builder -> builder.name("/test/dev/path01").type(ParameterType.STRING).value("data01"));
			
			client.getParametersByPathPaginator(builder -> builder.path("/test/prd/").recursive(Boolean.TRUE)).forEach(response -> {
				response.parameters().forEach(parameter -> log.info("SsmClient.getParametersByPath() {}={}", parameter.name(), parameter.value()));
			});
		}
	}
}
