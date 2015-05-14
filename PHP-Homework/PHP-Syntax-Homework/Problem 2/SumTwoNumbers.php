<?php

    $firstNumber1 = 2;
    $secondNumber1 = 5;
    $sum1 = $firstNumber1 + $secondNumber1;
    $sum1 = number_format($sum1, 2);

    $firstNumber2 = 1.567808;
    $secondNumber2 = 0.356;
    $sum2 = $firstNumber2 + $secondNumber2;
    $sum2 = number_format($sum2, 2);

    $firstNumber3 = 1234.5678;
    $secondNumber3 = 333;
    $sum3 = $firstNumber3 + $secondNumber3;
    $sum3 = number_format($sum3, 2);

    echo '$firstNumber + $secondNumber = ' . "$firstNumber1 + $secondNumber1 = " . "$sum1 <br>";

    echo '$firstNumber + $secondNumber = ' . "$firstNumber2 + $secondNumber2 = " . "$sum2 <br>";

    echo '$firstNumber + $secondNumber = ' . "$firstNumber3 + $secondNumber3 = " . "$sum3";

?>