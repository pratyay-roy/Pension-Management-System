package com.cts.pension.process;

import com.cts.pension.process.model.PensionerDetail;
import com.cts.pension.process.model.ProcessPensionResponse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ProcessPensionMicroserviceApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void main() {
        ProcessPensionMicroserviceApplication.main(new String[]{});
    }

    @Test
    void testSetterMethod() {
        PensionerDetail pensionerDetail = new PensionerDetail();
        pensionerDetail.setAadharNumber(420559429029l);
        pensionerDetail.setName("Pratyay");
        pensionerDetail.setDateOfBirth(LocalDate.of(1999, 04, 28));
        pensionerDetail.setPan("BSDPS1495K");
        pensionerDetail.setSalaryEarned(29000);
        pensionerDetail.setAllowances(1200);
        pensionerDetail.setPensionType("self");
        pensionerDetail.setBankName("SBI");
        pensionerDetail.setAccountNumber("9029486523");
        pensionerDetail.setBankType("private");

        assertThat(assertThat(pensionerDetail).isNotNull());
    }

    @Test
    void testNoArgs() {
        assertThat(new PensionerDetail()).isNotNull();
    }

    @Test
    void testProcessPensionResponce() {
        ProcessPensionResponse processPensionResponse = new ProcessPensionResponse();
        processPensionResponse.setProcessPensionStatusCode(10);
        assertThat(assertThat(processPensionResponse).isNotNull());
    }

    @Test
    void testProcessPensionResponceNoArgs() {
        assertThat(new ProcessPensionResponse()).isNotNull();
    }

}
