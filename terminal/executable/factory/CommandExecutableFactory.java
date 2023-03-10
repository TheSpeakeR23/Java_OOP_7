package terminal.executable.factory;

import terminal.Command;
import terminal.executable.executables.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}