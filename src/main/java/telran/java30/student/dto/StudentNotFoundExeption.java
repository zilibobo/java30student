package telran.java30.student.dto;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
public class StudentNotFoundExeption extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public StudentNotFoundExeption(int id) {
		super("Student with id "+id+" not found");
	}

}
