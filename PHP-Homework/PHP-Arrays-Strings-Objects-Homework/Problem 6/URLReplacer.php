
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>URL Replacer</title>
</head>

<body>
<form method="post">
    <label for="text">Text: </label><br/>
    <textarea name="text" id="text" rows="4" cols="50"></textarea><br/>
    <input type="submit" value="Extract sentences"/>
</form>

<br/>

<?php
if (isset($_POST["text"])) {
    if (!empty($_POST["text"])) {
        $text = preg_replace('/<\s*\/\s*a\s*>/', '[/URL]', $_POST["text"]);
        echo htmlentities(preg_replace('/<a(.*?)href=(\'|")([^>]+)(\'|")(.*?)>/', '[URL=\3]', $text));
    }
}
?>

</body>
</html>