package fr.lingui.util;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mongodb.client.MongoClients;

import fr.lingui.entity.UserEntity;
import fr.lingui.repository.UserRepository;

import static org.springframework.data.mongodb.core.query.Criteria.where;

public class IdGenerator {
	
	MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), "lingui");
	
	public long create() {
		
		Random random = new Random();
		long randomId = random.nextLong() * -1;
		long validRandomId = Long.signum(randomId) == -1 ? randomId * -1 : randomId;
		
		Query query = new Query(where("_id").is(validRandomId));
		
		if(mongoOps.findOne(query, UserEntity.class) != null) {
			create();
		}
		
		return validRandomId;
	}

}
