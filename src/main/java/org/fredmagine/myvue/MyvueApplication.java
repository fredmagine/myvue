package org.fredmagine.myvue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.fredmagine.myvue.mapper")
public class MyvueApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyvueApplication.class, args);
	}
}
