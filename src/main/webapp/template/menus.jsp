<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="js/menus.js"></script>
<div>
    <table>
        <c:forEach items="${menus}" var="menus">
           <tr>
               <td onclick="menusDetail('${menus.name}','${menus.url}')">
                   ${menus.name}
               </td>
           </tr>
        </c:forEach>
    </table>

</div>