package com.github.perscholas.validator;


import com.github.perscholas.models.UserAccount;
import com.github.perscholas.services.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    private final UserAccountService userAccountService;

    public UserValidator(UserAccountService userAccountService) {
        this.userAccountService = userAccountService;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return UserAccount.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        UserAccount userAccount = (UserAccount) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
        if (userAccount.getUsername().length() < 6 || userAccount.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (userAccountService.findByUsername(userAccount.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
        if (userAccount.getPassword().length() < 8 || userAccount.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }

        if (!userAccount.getPasswordConfirm().equals(userAccount.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
    }
}
