package com.example.myproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.wnameless.spring.bulkapi.AcceptBulk;
import com.github.wnameless.spring.bulkapi.Bulkable;

@Bulkable(autoApply = false)
@RestController
public class BulkController {

	@AcceptBulk
	@RequestMapping(value = "/product", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getProduct() {
		String result = "Mortgage product - simply plus";
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}

	@AcceptBulk
	@RequestMapping(value = "/purpose", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<?> getPurpose() {
		String result = "Home loan purpose";
		return new ResponseEntity<String>(result, HttpStatus.OK);
	}
}
