package use_case.logout;

/**
 * The Logout Interactor.
 */
public class LogoutInteractor implements LogoutInputBoundary {
    private LogoutUserDataAccessInterface userDataAccessObject;
    private LogoutOutputBoundary logoutPresenter;

    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        // TODO: save the DAO and Presenter in the instance variables.
        this.us
    }

    @Override
    public void execute() {
        // TODO: implement the logic of the Logout Use Case
        // * set the current username to null in the DAO
        userDataAccessObject.setCurrentUsername(null);
        LogoutOutputData logoutoutputdata = new LogoutOutputData(null);
        logoutPresenter.prepareSuccessView(logoutoutputdata);

        // * instantiate the `LogoutOutputData`, which needs to contain the username.
        // * tell the presenter to prepare a success view.
    }
}

