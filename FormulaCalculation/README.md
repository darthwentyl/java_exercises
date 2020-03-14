# Description
The exercise shows how in java is implemented polymorphism objects. The problem is calculation 
three formula - expotential, sinus, cosinus.

# Class hierarchy
```
                       Formula
                          ^
                          |
           +--------------+----------------+
           |              |                |
ExpotentialFunction  SinusFunction  CosinusFunction
```

# Solution
The solution uses [Taylor series](https://en.wikipedia.org/wiki/Taylor_series).
For expotential function uses [formula](https://en.wikipedia.org/wiki/E_(mathematical_constant)
in section "Complex numbers". For sinus and cosinus functions use [formula](https://en.wikipedia.org/wiki/Trigonometric_functions) in section "Power series expansion"
