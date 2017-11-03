package hiber.validation;


import hiber.UsersEntity;
import hiber.validation.annotation.PasswordMatches;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {
    @Override
    public void initialize(PasswordMatches constraintAnnotation) {
    }
    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context){
        UsersEntity user = (UsersEntity) obj;
        return user.getPassword().equals(user.getMatchingPassword());
    }
}