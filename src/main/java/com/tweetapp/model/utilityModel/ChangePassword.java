package com.tweetapp.model.utilityModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author Sinjon Nath
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChangePassword {
    private String oldPassword;
    private String newPassword;
}
