package com.github.Jcruz9.validator;

import com.github.Jcruz9.model.Account;
import com.github.Jcruz9.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class AccountValidator implements Validator {
    @Autowired
    private AccountService accountService;

    @Override
    public boolean supports(Class<?> aClass) {
        return Account.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Account account= (Account)o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email","NotEmpty");
        if(account.getEmail().length()<6 || account.getEmail().length() >32)
        {
            errors.rejectValue("email","Size.userForm.email");
        }
        if(accountService.findByEmail(account.getEmail()) !=null)
        {
            errors.rejectValue("email","Duplicate.userForm.email");
        }


        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","NotEmpty");
        if(account.getPassword().length()<8 || account.getPassword().length() >32)
        {
            errors.rejectValue("password","Size.userForm.password");
        }
        if(!account.getPasswordConfirm().equals(account.getPassword()))
        {
            errors.rejectValue("passwordConfirm","Diff.userForm.passwordConfirm");
        }
    }
}
