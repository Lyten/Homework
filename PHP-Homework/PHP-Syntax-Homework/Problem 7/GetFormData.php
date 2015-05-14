<html>

<head>
    <title>Form Data</title>
</head>

<body>
        <form action="" method="get">

            <input type="text" placeholder="Name.." name="name"/><br/>
            <input type="text" placeholder="age" name="age"/><br/>
            <input type="radio" name="gender" value="male"/> Male <br/>
            <input type="radio" name="gender" value="female"/> Female <br/>

            <input type="submit"/>

        </form>
</body>

</html>

<?php
    if(isset($_GET["name"], $_GET["age"], $_GET["gender"])) {

        $name = $_GET["name"];
        $age = $_GET["age"];
        $gender = $_GET["gender"];

        echo "My name is $name. I am $age years old. I am $gender. <br>";
    }
?>