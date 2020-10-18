package service;

import model.Device;
import model.Note;
import model.Tag;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class MainService {
    public static void main(String args[]) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-context.xml");

        UserService userService = (UserService) context.getBean("userService");
        NoteService noteService = (NoteService) context.getBean("noteService");
        DeviceService deviceService = (DeviceService) context.getBean("deviceService");
        TagService tagService = (TagService) context.getBean("tagService");

        User user = new User();
        user.setId(UUID.randomUUID());
        user.setEmail("test@test.ru");
        user.setPassword("password");

        userService.addUser(user);

        Note note = new Note();
        note.setId(UUID.randomUUID());
        note.setText("The quick brown fox jumps over the lazy dog");

        Note note2 = new Note();
        note.setId(UUID.randomUUID());
        note.setText("В чащах юга жил бы цитрус? Да, но фальшивый экземпляр!");

        noteService.addNote(note);

        List<Note> notes = new ArrayList<>();
        notes.add(note);
        notes.add(note2);

        user.setNotes(notes);

        Tag tag = new Tag();
        tag.setId(UUID.randomUUID());
        tag.setName("example");
        tag.setUser(user);
        tag.setNotes(Arrays.asList(note));

        Device device = new Device();
        device.setId(UUID.randomUUID());
        device.setUser(user);

    }
}
