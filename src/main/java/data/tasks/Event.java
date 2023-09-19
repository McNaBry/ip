package data.tasks;

import java.time.LocalDateTime;

import common.DateParser;

public class Event extends Task {
    private final LocalDateTime from;
    private final LocalDateTime to;

    public Event(
            String detail,
            LocalDateTime from,
            LocalDateTime to) {
        super(detail);
        this.from = from;
        this.to = to;
    }

    public Event(
            String detail,
            LocalDateTime from,
            LocalDateTime to,
            boolean isDone) {
        super(detail, isDone);
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format(
            "[E]%s (from: %s to: %s)",
            super.toString(),
            DateParser.toDisplayString(from),
            DateParser.toDisplayString(to)
        );
    }

    @Override
    public String toFileFormatString() {
        return String.format(
            "E|%s|%s|%s",
            super.toFileFormatString(),
            DateParser.toFileString(from),
            DateParser.toFileString(to)
        );
    }
}
