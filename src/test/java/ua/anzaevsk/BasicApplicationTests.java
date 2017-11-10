package ua.anzaevsk;

import com.fasterxml.jackson.databind.ObjectMapper;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.anzaevsk.controller.trade.TradeController;

import static org.hamcrest.Matchers.containsString;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import ua.anzaevsk.model.trade.Trade;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BasicApplicationTests {

    @Autowired
    private TradeController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testController() {
        System.out.println(assertThat(controller).toString());

    }

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        Trade t = new Trade();

        this.mockMvc.perform(post("/validateTrade")
                .content(asJsonString(t))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON));

    }

    public static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            final String jsonContent = mapper.writeValueAsString(obj);
            return jsonContent;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
