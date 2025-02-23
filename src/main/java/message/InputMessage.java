package message;

public enum InputMessage {
    INPUT_RACING_CAR_NAMES_MESSAGE("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
    INPUT_MOVE_COUNT_MESSAGE("시도할 회수는 몇회인가요?");

    String message;

    InputMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return this.message;
    }
}
