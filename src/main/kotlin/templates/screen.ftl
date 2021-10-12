<html>
<head>
    <title>${name}</title>
    <style>*{position:absolute}</style>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>

</head>
<body style="background: ${backgroundColor.hex}">
<#if components??>
<#list components as component>
    <#if component.type == "TextView">
    <h1 style="width: ${component.size.width}; height: ${component.size.height}; left:${component.location.x}; top:${component.location.y}; background-color: ${component.backgroundColor.hex}; font-size: ${component.font.size}; color: ${component.color.hex}">${component.label}</h1>
    </#if>
    <#if component.type == "Button">
    <button class="btn" style="width: ${component.size.width}; height: ${component.size.height}; left:${component.location.x}; top:${component.location.y}; background: ${component.color.hex}; font-size: ${component.font.size}">${component.label}</button>
    </#if>
    <#if component.type == "EditText">
    <input type="text" class="input" placeholder="${component.label}" style="width: ${component.size.width}; height: ${component.size.height}; left:${component.location.x}; top:${component.location.y}; background: ${component.backgroundColor.hex}; color: ${component.color.hex}; font-size: ${component.font.size}">
    </#if>
    <#if component.type == "CheckBox">
    <input type="checkbox" id="${component.name}" style="width: ${component.size.width}; height: ${component.size.height}; left:${component.location.x}; top:${component.location.y}; background: ${component.backgroundColor.hex}; color: ${component.color.hex}; font-size: ${component.font.size}">
    <label for="${component.name}" style="width: ${component.size.width}; height: ${component.size.height}; left:${component.location.x}; top:${component.location.y}; background: ${component.backgroundColor.hex}; color: ${component.color.hex}; font-size: ${component.font.size}">${component.label}</label>
    </#if>
    <#if component.type = "RadioButton">
    <input type="radio" id="${component.name}" style="width: ${component.size.width}; height: ${component.size.height}; left:${component.location.x}; top:${component.location.y}; background: ${component.backgroundColor.hex}; color: ${component.color.hex}; font-size: ${component.font.size}">
    <label for="${component.name}" style="width: ${component.size.width}; height: ${component.size.height}; left:${component.location.x}; top:${component.location.y}; background: ${component.backgroundColor.hex}; color: ${component.color.hex}; font-size: ${component.font.size}">${component.label}</label>
    </#if>
    <#if component.type = "SeekBar">
    <input type="slider" min="1" max="100" value="1" style="width: ${component.size.width}; height: ${component.size.height}; left:${component.location.x}; top:${component.location.y}; background: ${component.backgroundColor.hex}; color: ${component.color.hex}; font-size: ${component.font.size}" >
    </#if>
</#list>
</#if>
</body>
</html>