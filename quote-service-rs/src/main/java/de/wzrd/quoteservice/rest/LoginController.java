package de.wzrd.quoteservice.rest;

import de.wzrd.quoteservice.gen.GetUser;
import de.wzrd.quoteservice.gen.LoginUser;
import de.wzrd.quoteservice.gen.SessionApi;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

@Getter
@SessionScope
@RequiredArgsConstructor
@RestController
public class LoginController implements SessionApi {

    private UUID id;

    @Override
    public ResponseEntity<Void> addSession(LoginUser loginUser) {
        if (Objects.isNull(id)) {
            this.id = UUID.randomUUID();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<Void> deleteSession() {
        this.id = null;
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<GetUser> getSession() {
        if (Objects.isNull(this.id))
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(
                new GetUser()
                        .alias("")
                        .id(this.id.toString())
                        .createdAt(OffsetDateTime.now())
                        .lastName("")
                        .firstName("")
        );
    }

}
