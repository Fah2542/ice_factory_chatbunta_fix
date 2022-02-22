package nvc.it.test_springboot.model;

import java.util.Date;
import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Events {
    private String amount;

    @CreatedDate
    private Date createdAt;
}
