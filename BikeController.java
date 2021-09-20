package com.demo.json.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.json.model.Bike;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class BikeController {
	
	@GetMapping("/getbike")
	public String ReadData() throws FileNotFoundException, IOException, ParseException {
		

		FileReader reader= new FileReader("D:\\STS work\\saveDataIntoJsonFile-1\\src\\main\\resources\\data.json");
		BufferedReader br = new BufferedReader(reader);
		String str;
		
		while((str= br.readLine())!=null) {
				System.out.println(str);
			}
		
		br.close();
		
		return "Data fetched succesfully";
		
//		ObjectMapper mapper = new ObjectMapper();// provide functionality to read and write json either from basic POJO or to & from general json tree model(jsonNode)
//		File file = new File("D:\\STS work\\saveDataIntoJsonFile-1\\src\\main\\resources\\data.json");
//		InputStream ist = new FileInputStream(file);
		
//		org.json.simple.parser.JSONParser jsonParse = new org.json.simple.parser.JSONParser();
		
				
//		Object obj = jsonParse.parse(reader);
//		JSONArray bikeList = (JSONArray) obj;
//		System.out.println(bikeList);
		
//		return bikeList;
		
	}
	
	@PostMapping("/insertbike")
	public JSONObject InsertData(@RequestBody Bike bi) throws JsonGenerationException, JsonMappingException, IOException {
		
		File file = new File("D:\\STS work\\saveDataIntoJsonFile-1\\src\\main\\resources\\data.json");
		
		JSONObject jsonObject = new JSONObject(); //created a json objc to add values
		
		jsonObject.put("bikeName", bi.getBikeName());
		jsonObject.put("bikeCompany", bi.getBikeCompany());
		jsonObject.put("bikeEngine", bi.getBikeEngine());
		jsonObject.put("bikePrice", bi.getBikePrice());
		jsonObject.put("bikeColor", bi.getBikeColor());
		
		//write to file
		FileWriter fileWriter = new FileWriter(file, true);
		fileWriter.write(jsonObject.toString());
		fileWriter.flush();
		fileWriter.close();
		
		return jsonObject;
//		ObjectMapper mapper = new ObjectMapper();// provide functionality to read and write json either from basic POJO or to & from general json tree model(jsonNode)
		
//		InputStream ist = new FileInputStream(file);
		
//		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//		bufferedWriter.close();
		
//		Bike b = new Bike();
//		
//		b.setBikeName(bi.getBikeName());
//		b.setBikeCompany(bi.getBikeCompany());
//		b.setBikeEngine(bi.getBikeEngine());
//		b.setBikePrice(bi.getBikePrice());
//		b.setBikeColor(bi.getBikeColor());
		
//		mapper.writeValue(file, b);
//		ist.close();
	
	}
	
	
}
