package server.messaging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import server.contract.CalculationRequest;
import server.contract.CalculationResponse;
import server.executor.SocketCalculationExecutor;

@Controller
public class CalculationController {
	@MessageMapping("/calculate")
	@SendTo("/topic/calculation")
	public CalculationResponse greeting(CalculationRequest message) throws Exception {
        SocketCalculationExecutor server = new SocketCalculationExecutor();
        Logger logger = LoggerFactory.getLogger(CalculationController.class);
        logger.info("Inside CalculatorController :" + message);
		return new CalculationResponse("Answer:- " + server.execute(HtmlUtils.htmlEscape(message.getName())));
	}
}
