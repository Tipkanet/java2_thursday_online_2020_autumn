package teacher.lesson_2_single_responsibility_principle.homework.step_3_srp_level_package.after.console_ui;

public class ExitUIAction implements UIAction {
	@Override
	public void execute() {
		System.out.println("Good by!");
		System.exit(0);
	}
}
