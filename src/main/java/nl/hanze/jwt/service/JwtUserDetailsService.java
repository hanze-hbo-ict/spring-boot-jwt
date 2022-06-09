package nl.hanze.jwt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/*
JWTUserDetailsService implements the Spring Security UserDetailsService interface.
It overrides the loadUserByUsername for fetching user details from the database
using the username.

The Spring Security Authentication Manager calls this method for getting the user
details from the database when authenticating the user details provided by the user.

In this case, we just use plain text for users.
*/


@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String password = new BCryptPasswordEncoder().encode("password");
		ArrayList<GrantedAuthority> authorities = new ArrayList<>();
		if ("hanze-user".equals(username)) {
			return new User("hanze-user", password,
					authorities);
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}
