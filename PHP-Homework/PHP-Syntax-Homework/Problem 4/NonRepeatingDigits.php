<?php
nonRepeatNum(1234);
nonRepeatNum(145);
nonRepeatNum(15);
nonRepeatNum(247);

    function nonRepeatNum($num) {
        echo "<br>";
        if ($num < 100) {
            echo 'no';
            return;
        }
        echo "<br>";
        for ($i = 101; $i <= $num; $i++) {
            if ($i > 999) {
                return;
            }
            $varString = $i . '';
            if ($varString[0] != $varString[1] && $varString[0] != $varString[2] && $varString[1] != $varString[2]) {
                echo $varString . ', ';
            }
        }
        echo "<br>";
    }
?>