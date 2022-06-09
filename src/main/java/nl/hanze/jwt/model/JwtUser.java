package nl.hanze.jwt.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class JwtUser extends User implements GrantedAuthority{

    public JwtUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);

        Objects.requireNonNull(authorities);
        if(authorities.isEmpty()) throw new IllegalArgumentException("authorities is empty");
    }

    @Override
    public String getAuthority() {
        return getAuthorities().iterator().next().getAuthority();
    }
}
