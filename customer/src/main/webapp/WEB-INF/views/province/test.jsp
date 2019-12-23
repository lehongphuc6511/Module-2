<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head th:replace="/layout/tables::head"></head>

<body id="page-top">

<div th:replace="/layout/tables::navbar"></div>

<div id="wrapper">
    <!--.-->
    <div th:replace="/layout/tables::sidebar"></div>
    <!--.-->
    <div id="content-wrapper">

        <div class="container-fluid">

            <div th:replace="/layout/tables::BreadCrumbs"></div>

            <!-- DataTables Example -->
            <div class="card mb-3">
                <div class="card-header">
                    <i class="fas fa-table"></i>
                    Customer Table
                </div>
                <div class="card-body">
                    <div class="table-responsive">
                        <th:block th:if="${message}">
                            <p th:text="${message}"></p>
                        </th:block>
                        <form th:action="@{/edit-province}" th:object="${province}" method="post">
                            <input th:type="hidden" name="id" th:field="*{id}">
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                            <tr>
                                <td>First name:</td>
                                <td><input type="text" th:field="*{name}"/></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" value="Update province"></td>
                            </tr>
                        </table>
                        </form>
                    </div>
                </div>
                <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
            </div>

            <p class="small text-center text-muted my-5">
                <em>More table examples coming soon...</em>
            </p>

        </div>
        <!-- /.container-fluid -->

        <div th:replace="/layout/tables::footer">
            <!-- Sticky Footer -->
        </div>

    </div>
    <!-- /.content-wrapper -->

</div>
<!-- /#wrapper -->
<div th:replace="/layout/tables::scroll"></div>

<div th:replace="/layout/tables::layout"></div>

<div th:replace="/layout/tables::js"></div>

</body>

</html>
