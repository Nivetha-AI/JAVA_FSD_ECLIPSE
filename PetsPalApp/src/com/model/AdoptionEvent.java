package com.model;

import java.util.ArrayList;
import java.util.List;

public class AdoptionEvent {

	List<IAdoptable> participantlist=new ArrayList<>();
	
	public void hostEvent() {
		
	}
	public void registerParticipant(IAdoptable participant) {
		participantlist.add(participant);
	}
	
}
