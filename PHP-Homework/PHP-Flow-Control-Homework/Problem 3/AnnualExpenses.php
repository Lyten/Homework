<?php
function getMonthName($number)
{
    return date("F", strtotime(date("d-$number-Y")));
}
?>

<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Annual Expenses</title>
</head>

<body>
<form method="post">
    <label for="expens">Enter number of years:</label>
    <input type="text" name="expens" id="expens"/>
    <input type="submit" value="Show costs"/>
</form>

<br/>
<?php
if (isset($_POST["expens"]) && !empty($_POST["expens"])):
    $years = $_POST["expens"];
    $currentYear = date("Y");
    ?>
    <table border="1">
        <thead>
        <tr>
            <th>Year</th>

            <?php
            for ($month = 1; $month <= 12; $month++) {
                echo "<th>" . getMonthName($month) . "</th>";
            }
            ?>

            <th>Total:</th>
        </tr>
        </thead>

        <tbody>

        <?php
        for ($year = $currentYear; $year > $currentYear - $years; $year--) {
            echo "<tr><td>$year</td>";
            $total = 0;
            for ($month = 1; $month <= 12; $month++) {
                $currentexpens = rand(0, 999);
                echo "<td>" . $currentexpens . "</td>";
                $total += $currentexpens;
            }
            echo "<td>$total</td></tr>";
        }
        ?>

        </tbody>
    </table>
<?php endif; ?>

</body>
</html>