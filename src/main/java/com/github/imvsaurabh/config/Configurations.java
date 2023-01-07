package com.github.imvsaurabh.config;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.github.imvsaurabh.constant.Constant;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class Configurations {
	
	private static MongoClientSettings clientSettings() {
		ConnectionString connectionString = new ConnectionString(Constant.MONGO_URI);
		CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
		CodecRegistry codecRegistry = fromRegistries(getDefaultCodecRegistry(), pojoCodecRegistry);
		return MongoClientSettings.builder().codecRegistry(codecRegistry).applyConnectionString(connectionString).build();
	}
	
	public static MongoClient mongoClient() {
		return MongoClients.create(clientSettings());
	}
}
