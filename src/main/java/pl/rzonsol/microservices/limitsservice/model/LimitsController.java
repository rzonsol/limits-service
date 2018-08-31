package pl.rzonsol.microservices.limitsservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LimitsController {
    private int maximum;
    private int minimum;
}
