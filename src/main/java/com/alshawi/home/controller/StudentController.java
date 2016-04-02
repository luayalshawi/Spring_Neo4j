package com.alshawi.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alshawi.home.nodes.Student;
import com.alshawi.home.repository.StudentRepository;


@Configuration
@Controller
@RequestMapping("student")
public class StudentController {
	@Autowired
	StudentRepository studentRepository;

	@RequestMapping("add")
	public String addStudent()
	{
		return "add_student";
	}
	@RequestMapping("show/StudentByUniversity/{college}")
	public String showStudent(@PathVariable("college") String college,Model model)
	{
		//System.out.println(studentRepository.count());
		//System.out.println(studentRepository.getStudentByName("Luay").getUniversity());
		//System.out.println(studentRepository.getStudentFromId(346).getMajor());
		model.addAttribute("students",studentRepository.getStudentByUniversity(college));
		return "show_student";
	}
	@RequestMapping(value="added" ,method = RequestMethod.POST)
	public String addedStudent(@RequestParam("username") String username,
			@RequestParam("major") String major,
			@RequestParam("university") String university
			)
	{
		System.out.println(username);

		Student s = new Student();
		//s.setID(students.size());
		s.setName(username);
		s.setMajor(major);
		s.setUniversity(university);
		studentRepository.save(s);
		
		return "add_student";
	}

	@RequestMapping(value="show/StudentByUniversity/",method = RequestMethod.POST)
	public String showStudentByCollege(@RequestParam("college_search") String college,Model model)
	{
		model.addAttribute("students",studentRepository.getStudentByUniversity(college));
		return "show_student";
	}
}
