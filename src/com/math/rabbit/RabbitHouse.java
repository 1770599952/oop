package com.math.rabbit;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class RabbitHouse {
	
	Set<Rabbit> rabbits = new CopyOnWriteArraySet<Rabbit>();
	
	public RabbitHouse() {
		Rabbit rabbit = new Rabbit(1, this);
		rabbits.add(rabbit);
	}
	// 移除一个兔子
	public void removeRabbit(Rabbit rabbit) {
		rabbits.remove(rabbit);
	}
	
	public void addRabbit(Rabbit rabbit) {
		rabbits.add(rabbit);
	}
	
	public int getTotalCounts(int currentMonth) {		
		for(int i = 1;i < currentMonth;i++) {
			Iterator<Rabbit> it = rabbits.iterator();
			while(it.hasNext()) {
				Rabbit rabbit = it.next();
				rabbit.getBody(i);
				rabbit.die(i);
			}
		}
		return rabbits.size();
	}

}
