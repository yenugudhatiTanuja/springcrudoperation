package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController {
	@GetMapping("/collegedetails")
	public List<College> getAllcollegeDetails() {
		return CollegeServicer.getcollegDetails();
	}

	@GetMapping("/collegedetails/{collegeId}")
	public College getCollgeById(@PathVariable int collegeId)

	{
		return CollegeServicer.getCollegeDtetailsById(collegeId);
	}

	@PostMapping("/addcollegedetails")
	public College addCollege(@RequestBody College col) {
		return CollegeServicer.addCollegeDetails(col);
	}
	@DeleteMapping("/removecollegedetails/{collegeId}")
	public College removeCollege(@PathVariable int collegeId)
	{
		return CollegeServicer.removeCollegeDetailsById(collegeId);
	}
	
	//}
	
}
