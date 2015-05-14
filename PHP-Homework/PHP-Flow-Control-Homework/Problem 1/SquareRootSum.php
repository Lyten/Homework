<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Square Root Sum</title>
</head>

<body>
<table border="1">
    <thead>
    <tr>
        <th><strong>Number</strong></th>
        <th><strong>Square</strong></th>
    </tr>
    </thead>

    <tbody>

    <?php
    $sum = 0;
    for ($number = 0; $number <= 100; $number += 2) {
        echo "<tr><td>$number</td><td>" . round(sqrt($number), 2) . "</td></tr>";
        $sum += sqrt($number);
    }
    ?>

    </tbody>

    <tfoot>
        <tr>
            <td><strong>Total:</strong></td>
            <td><?= round($sum, 2) ?></td>
        </tr>
    </tfoot>
</table>

</body>
</html>