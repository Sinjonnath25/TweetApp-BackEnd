package com.tweetapp.model.utilityModel;

import lombok.Data;
/**
 * @author Sinjon Nath
 *
 */
@Data
public class LoginModel {
    private String userId;
    private String password;
    private String jwt;
}
