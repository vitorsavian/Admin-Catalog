package com.fullcycle.www.domain.category;

import com.fullcycle.www.domain.validation.Error;
import com.fullcycle.www.domain.validation.ValidationHandler;
import com.fullcycle.www.domain.validation.Validator;

public class CategoryValidator  extends Validator {

    private final Category category;

    public CategoryValidator(final Category aCategory, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        if (this.category.getName() == null) {
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
