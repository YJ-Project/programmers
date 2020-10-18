<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
function reverseVowels(str){
    var vowels = str.match(/[aeiou]/g);
    return str.replace(/[aeiou]/g, function() {
        return vowels.pop();
    });
}

//example
var original = 'James Bond';
var result = reverseVowels(original);
console.log(result);
//output for snippet
document.write(original + ' => ' + result);
</script>

</body>
</html>