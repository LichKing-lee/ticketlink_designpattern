package com.ticketlink.ocp;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ChangYong on 2016. 6. 11..
 */
public class TestTicketReserve {
    ConcreteTicketReserve concreteTicketReserve;
    ClientTicketReserve clientTicketReserve;

    @Before
    public void setUp(){
        concreteTicketReserve = new ConcreteTicketReserve();
        clientTicketReserve = new ClientTicketReserve();
    }

    @Test
    public void 콘크리트_테스트_5000원(){
        assertThat(concreteTicketReserve.isPossiblebuyTicket(5000), is(false));
    }

    @Test
    public void 콘크리트_테스트_9000원(){
        assertThat(concreteTicketReserve.isPossiblebuyTicket(9000), is(false));
    }

    @Test
    public void 클라이언트_테스트_월요일_5000원(){
        clientTicketReserve.setCalculable(new MonPrice());

        assertThat(clientTicketReserve.isPossiblebuyTicket(5000), is(true));
    }

    @Test
    public void 클라이언트_테스트_화요일_5000원(){
        clientTicketReserve.setCalculable(new TuesPrice());

        assertThat(clientTicketReserve.isPossiblebuyTicket(5000), is(false));
    }

    @Test
    public void 클라이언트_테스트_화요일_9000원(){
        clientTicketReserve.setCalculable(new TuesPrice());

        assertThat(clientTicketReserve.isPossiblebuyTicket(9000), is(true));
    }
}
