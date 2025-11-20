package org.restapi;

import io.smallrye.common.constraint.NotNull;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

public class PersonModel {

    @NotNull
    @Schema(required=true,example="Adam")
    public String firstName;
    @NotNull
    @Schema(required=true,example="Eve")
    public String lastName;
    public String otherName;

    public PersonModel() {
    }
}
