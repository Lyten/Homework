<?php
    $name = 'Pesho';
    $phone = "0884-888-888";
    $age = 67;
    $address = "Suhata Reka";
?>

<!DOCTYPE html>

<head>
    <title>Info Table</title>
    <link rel="stylesheet" href="style.css" />
</head>

<body>
    <div id='wrapper'>
        <table border="1">

            <tr>
                <td>Name</td>
                <td>
                    <?= $name ?>
                </td>
            </tr>

            <tr>
                <td>Phone number</td>
                <td>
                    <?= $phone ?>
                </td>
            </tr>

            <tr>
                <td>Age</td>
                <td>
                    <?= $age ?>
                </td>
            </tr>

            <tr>
                <td>Address</td>
                <td>
                    <?= $address ?>
                </td>
            </tr>
            
        </table>

    </div>
</body>
