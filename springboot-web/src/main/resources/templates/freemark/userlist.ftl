<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <title>User List</title>
    <link rel="stylesheet" href="/css/bootstrap.css" />
</head>

<body>
 <div class="container">
    <h3>Freemark 模板引擎</h3>
    <p>当前时间：${.now?string("yyyy-MM-dd HH:mm:ss.sss")}</p>
    <table class="table table-bordered">
        <thead>
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Age</td>
        </tr>
        </thead>
        <tbody>
            <#list userList as item>
                <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.age}</td>
                </tr>
            </#list>
        </tbody>
    </table>
 </div>
</body>
</html>