package lesson_3_request_response_input_data_validation.homework.step_6_input_data_validation.after.core.responses;

import java.util.List;

import lesson_3_request_response_input_data_validation.homework.step_6_input_data_validation.after.Book;

public class AddBookResponse extends CoreResponse {

	private Book newBook;

	public AddBookResponse(List<CoreError> errors) {
		super(errors);
	}

	public AddBookResponse(Book newBook) {
		this.newBook = newBook;
	}

	public Book getNewBook() {
		return newBook;
	}
}