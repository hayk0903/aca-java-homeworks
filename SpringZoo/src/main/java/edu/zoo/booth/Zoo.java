package edu.zoo.booth;


import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.zoo.booth.classes.Animal;
import edu.zoo.booth.classes.StaffMember;
import edu.zoo.booth.classes.Ticket;

@Component
public class Zoo implements TicketBooth<Ticket> {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private List<Ticket> soldTickets;
	@Autowired
	private List<StaffMember> staffMembers;
	@Autowired
	private List<Animal> animals;
	
	@Override
	public String toString() {
		logger.info("Zoo sucessfully generated and printed");
		return "Zoo [soldTickets=" + soldTickets + ", staffMembers=" + staffMembers + ", animals=" + animals + "]";
	}


	@Override
	public void sellTicket(int price) {
		Ticket ticket = new Ticket();
		ticket.setPrice(price);
		soldTickets.add(ticket);
		logger.info("A new ticket has been sold with price: " + price);
	}

	
	

	
}
