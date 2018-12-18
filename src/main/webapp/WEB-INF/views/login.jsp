<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
		<title>Login</title>
	</head>

	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-4 col-md-offset-4">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Please sign in</h3>
						</div>
						<div class="panel-body">
							<c:if test="${not empty error}">
								<div class="alert alert-danger">
									<spring:message
										code="AbstractUserDetailsAuthenticationProvider.badCredentials" />
									<br />
								</div>
							</c:if>
							<form action="<spring:url value="/doLogin"></spring:url>" method="post">
								<sec:csrfInput />
								<fieldset>
									<div class="form-group">
										<input class="form:input-large" placeholder="User Name" name="username" type="text">
									</div>
									<div class="form-group">
										<input class="form:input-large" placeholder="Password"
											name="password" type="password" value="">
									</div>
									<input class="btn btn-lg btn-success btn-mini" type="submit" value="Login">
								</fieldset>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>