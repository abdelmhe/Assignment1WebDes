package ca.sheridancollege.abdelmhe.model;


import ca.sheridancollege.abdelmhe.GameOptions;

public class UserData {
    private GameOptions _gameOption;
    private int option;
    private String _ComputerOption;
    private String _Result;

    public GameOptions get_gameOption() {
        return _gameOption;
    }

    public void set_gameOptions(GameOptions _gameOption) {
        this._gameOption = _gameOption;
    }

    public String get_ComputerOption() {
        return _ComputerOption;
    }

    public void set_ComputerOption(String _ComputerOption) {
        this._ComputerOption = _ComputerOption;
    }

    public String get_Result() {
        return _Result;
    }

    public void set_Result(String _Result) {
        this._Result = _Result;
    }
}

