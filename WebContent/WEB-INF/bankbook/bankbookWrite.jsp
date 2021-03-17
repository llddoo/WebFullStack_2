<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>BankBook Write Page</h1>
	<form class="form-horizontal" action="./bankbookWrite.do" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="bookname">BookName:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="bookname" placeholder="bookname" name="bookName">
      </div>
    </div>
   
   <div class="form-group">
      <label class="control-label col-sm-2" for="bookrate">BookName:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="bookrate" placeholder="bookrate" name="bookRate">
      </div>
    </div>
    
    <div class="form-group">
  <label for="booksale">BookSale:</label>
  <select class="form-control" id="bookSale" name="bookSale">
    <option>Y</option>
    <option>N</option>
  </select>
</div>
   
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</body>
</html>