package crudOperations;

import deserialization.getWeather.GetWeatherResponse;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetWeather {
	public static void main(String [] args) {
		RestAssured.baseURI="http://api.openweathermap.org";
		RequestSpecification req = RestAssured
			.given()
				.contentType(ContentType.JSON)
				.queryParam("q", "Delhi")
				.queryParam("appid", "032141f10cb32d52af49c43275a394ca");
		
		Response res = req.get("/data/2.5/weather");
		GetWeatherResponse response = res.as(GetWeatherResponse.class);
		System.out.println("Get Call Response:  \n");
		System.out.println("Name: "+response.getName());
		System.out.println("COD: "+ response.getCod());
		System.out.println("Wind-Speed: "+response.getWind().getSpeed());
		System.out.println("Latitude: "+response.getCoord().getLat());
		System.out.println("Weather:");
		for(int i=0;i<response.getWeather().size();i++) {
			System.out.println(" Id: "+response.getWeather().get(i).getId());
			System.out.println(" Main: "+response.getWeather().get(i).getMain());
			System.out.println(" Description: "+response.getWeather().get(i).getDescription());
			System.out.println(" Icon: "+response.getWeather().get(i).getIcon());
		}
	}
}