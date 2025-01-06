package springSecurity.practiceSecurity.util;

import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.websocket.Decoder;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.security.Key;

@Slf4j
@Component
public class TokenProvider {
//    private final Key key;
//
//    public TokenProvider(@Value("${jwt.secret")String secretKey){
//        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
//        this.key = Keys.hmacShaKeyFor(keyBytes);
//    }
    // 이후 구현
}
