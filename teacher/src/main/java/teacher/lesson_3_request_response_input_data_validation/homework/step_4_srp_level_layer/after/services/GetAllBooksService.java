package teacher.lesson_3_request_response_input_data_validation.homework.step_4_srp_level_layer.after.services;

import java.util.List;

import teacher.lesson_3_request_response_input_data_validation.homework.step_4_srp_level_layer.after.Book;
import teacher.lesson_3_request_response_input_data_validation.homework.step_4_srp_level_layer.after.Database;

public class GetAllBooksService {

	private Database database;

	public GetAllBooksService(Database database) {
		this.database = database;
	}

	public List<Book> execute() {
		return database.getAllBooks();
	}

}